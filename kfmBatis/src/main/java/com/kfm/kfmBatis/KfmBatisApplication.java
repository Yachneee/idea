package com.kfm.kfmBatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Yachne
 * MapperScan：扫描指定包下的所有mapper接口，这样就不用在每个mapper接口上添加@Mapper注解了,
 * 当启动的时候主动去加载某个包所有类，并且创建对象，放到spring容器中
 */
@SpringBootApplication
@MapperScan("com.kfm.kfmBatis.mapper")
public class KfmBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(KfmBatisApplication.class, args);
    }

}
