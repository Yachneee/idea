package com.kfm.schoolBatis.interceptor;

import com.kfm.schoolBatis.entity.bean.AccessInfo;
import com.kfm.schoolBatis.entity.bean.AccessMap;
import com.kfm.schoolBatis.utils.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author Administrator
 * 一秒请求次数过多禁掉IP
 */
@Component
public class RequestMuchInterceptor implements HandlerInterceptor {
    @Autowired
    private AccessMap accessMap;
    @Autowired
    private AccessIpInterceptor accessIpInterceptor;
    @Value("${school.request_count}")
    private Integer max;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String ip = IpUtil.getIpAddress(request);
        Map<String, AccessInfo> accessInfoMap = accessMap.getAccessInfoMap();
        AccessInfo accessInfo = accessInfoMap.get(ip);
        long current = System.currentTimeMillis();
        //如果是第一次访问
        if(accessInfo==null) {
            AccessInfo accessInfo1 = new AccessInfo();
            accessInfo1.setCountInOneSecond(1);
            accessInfo1.setLastTime(current);
            accessInfoMap.put(ip, accessInfo1);
            return true;
        }else if(current-accessInfo.getLastTime()>1000) {
            //如果与上次访问间隔超过1秒
            accessInfo.setCountInOneSecond(1);
            accessInfo.setLastTime(current);
            return true;
        }else {
            //如果与上次访问间隔不超过1秒，1秒之内访问的，判断访问次数
            int countInOneSecond = accessInfo.getCountInOneSecond()+1;
            if(countInOneSecond>max) {
                //超过10次，拉入黑名单
                accessIpInterceptor.blackIPList.add(ip);
                response.sendRedirect(request.getContextPath()+"/error");
                return false;
            }else {
                //没有超过10次，更新访问次数和时间
                accessInfo.setCountInOneSecond(countInOneSecond);
                accessInfo.setLastTime(current);
                return true;
            }
        }
    }
}
