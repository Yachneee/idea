package com.kfm.springBatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("com.kfm.springBatis.mapper")
public class SpringBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatisApplication.class, args);
    }

}
