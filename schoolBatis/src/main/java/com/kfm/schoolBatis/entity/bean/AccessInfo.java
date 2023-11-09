package com.kfm.schoolBatis.entity.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author Yachne
 * 存储上一次访问的时间戳以及1s内访问的次数
 */
@Data
@Component
public class AccessInfo {
    private long lastTime;
    private Integer countInOneSecond;
}
