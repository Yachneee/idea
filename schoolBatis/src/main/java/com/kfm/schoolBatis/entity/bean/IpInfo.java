package com.kfm.schoolBatis.entity.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Administrator
 * 整个系统所有访问ip的信息
 */
@Component
@Data
public class IpInfo {
    private Map<String,Integer> ipMap;
    public IpInfo(){
        ipMap=new ConcurrentHashMap<>();
    }
}
