package com.kfm.listen;

import com.kfm.utils.Constant;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Administrator
 */
@WebListener
public class ApplicationListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ConcurrentHashMap<String, HttpSession> map = new ConcurrentHashMap<>();
        //存储登录用户
        sce.getServletContext().setAttribute(Constant.ONLINE_USER_KEY,map);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
