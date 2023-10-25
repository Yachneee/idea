package com.kfm.listen;

import com.kfm.utils.Constant;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Administrator
 */
@WebListener
public class LoginListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        ConcurrentHashMap<String, HttpSession> onlineUser = getOnlineUser(event);
        if (onlineUser != null) {
            HttpSession session = event.getSession();
            onlineUser.put(session.getId(), session);
        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        ConcurrentHashMap<String, HttpSession> onlineUser = getOnlineUser(event);
        if (onlineUser != null) {
            HttpSession session = event.getSession();
            onlineUser.remove(session.getId(), session);
        }
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        ConcurrentHashMap<String, HttpSession> onlineUser = getOnlineUser(event);
        if (onlineUser != null) {
            HttpSession session = event.getSession();
            onlineUser.replace(session.getId(), session);
        }
    }
    private ConcurrentHashMap<String, HttpSession> getOnlineUser(HttpSessionBindingEvent event){
        if(Constant.LOGIN_USER_KEY.equals(event.getName())){
            ServletContext context = event.getSession().getServletContext();
            return (ConcurrentHashMap<String, HttpSession>) context.getAttribute(Constant.ONLINE_USER_KEY);
        }
        return null;
    }
}
