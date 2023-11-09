package com.kfm.schoolBatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("com.kfm.schoolBatis.mapper")
public class SchoolBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolBatisApplication.class, args);
    }

}
