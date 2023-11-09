package com.kfm.schoolBatis.interceptor;

import com.kfm.schoolBatis.utils.IpUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Administrator
 */
@Component
public class AccessIpInterceptor implements HandlerInterceptor {
    public final List<String> blackIPList=new CopyOnWriteArrayList<>();
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String ip = IpUtil.getIpAddress(request);
        if(blackIPList.contains(ip)){
            response.sendRedirect(request.getContextPath()+"/error");
            return false;
        }
        return true;
    }
}
