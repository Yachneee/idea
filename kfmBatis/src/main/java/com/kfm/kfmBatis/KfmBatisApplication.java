package com.kfm.kfmBatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
// 当启动的时候主动去加载某个包所有类，并且创建对象
@MapperScan("com.kfm.kfmBatis.mapper")
public class KfmBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(KfmBatisApplication.class, args);
    }

}
