package com.kfm.schoolBatis.config;

import com.kfm.schoolBatis.interceptor.AccessIpInterceptor;
import com.kfm.schoolBatis.interceptor.LoginCountInterceptor;
import com.kfm.schoolBatis.interceptor.MyInterceptor;
import com.kfm.schoolBatis.interceptor.RequestMuchInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author Administrator
 */
@Configuration
public class SchoolBatisConfig extends WebMvcConfigurationSupport {


    @Autowired
    private MyInterceptor myInterceptor;
    @Autowired
    private LoginCountInterceptor loginCountInterceptor;
    @Autowired
    private AccessIpInterceptor accessIpInterceptor;
    @Autowired
    private RequestMuchInterceptor requestMuchInterceptor;
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
        registry.addResourceHandler("/font/**").addResourceLocations("classpath:/static/font/");
        registry.addResourceHandler("/avatar/**").addResourceLocations("file:D:/upload/avatar/");
    }
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        // addInterceptor 配置拦截器对象
        // addPathPatterns 配置哪些进入该拦截器
        // excludePathPatterns 配置哪些请求不进入拦截器
         registry.addInterceptor(myInterceptor).addPathPatterns("/**").
                 excludePathPatterns("/login", "/captcha", "/js/**", "/css/**", "/font/**", "/error");
        registry.addInterceptor(loginCountInterceptor).addPathPatterns("/login")
                .excludePathPatterns("/captcha", "/js/**", "/css/**", "/font/**", "/error");
        registry.addInterceptor(requestMuchInterceptor).addPathPatterns("/**").excludePathPatterns("/error");
        registry.addInterceptor(accessIpInterceptor).addPathPatterns("/**").excludePathPatterns("/error");

    }
}
