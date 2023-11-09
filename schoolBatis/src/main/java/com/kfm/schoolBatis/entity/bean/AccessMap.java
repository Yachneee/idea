package com.kfm.schoolBatis.entity.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Yachne
 * 所有访问ip上一次访问的时间戳以及1s内访问的次数
 */
@Component
@Data
public class AccessMap {
    private Map<String,AccessInfo> accessInfoMap;
    public AccessMap(){
        accessInfoMap=new ConcurrentHashMap<>();
    }
}
