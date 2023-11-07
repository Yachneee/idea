package com.kfm.kfmBatis.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Component
public class kfmBatisConfig extends WebMvcConfigurationSupport {
    /**
     * 重写addResourceHandlers 静态资源映射处理
     * addResourceHandler() 你要处理的请求
     * @param registry registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/img/");
        registry.addResourceHandler("/static/avatar/**").addResourceLocations("file:D:/upload/avatar/");
    }
}
