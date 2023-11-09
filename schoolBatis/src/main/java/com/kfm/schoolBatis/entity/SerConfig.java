package com.kfm.schoolBatis.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Data
@ConfigurationProperties(prefix = "ser")
@Component
public class SerConfig {
    private String ip;
    private int port;
}
