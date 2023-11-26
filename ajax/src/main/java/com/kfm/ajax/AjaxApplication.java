package com.kfm.ajax;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.kfm.ajax.mapper")
@SpringBootApplication
public class AjaxApplication {

	public static void main(String[] args) {
		SpringApplication.run(AjaxApplication.class, args);
	}

}
