package com.ll.blog.interceptor;

import com.ll.blog.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 后台访问接口的拦截器
 * 说明：对于以/admin开头的地址进行拦截，必须经过验证之后才能够访问
 *
 * @Author leon
 * @Date 2019/5/31 15:18
 */
public class BackInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(BackInterceptor.class);
    private static final String username = "ll";
    private static final String password = "123456TY&gh";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {
        boolean flag;
        logger.info("进入过滤器");
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            request.getRequestDispatcher(request.getContextPath() + "/error.html").forward(request, response);
            flag = false;
        } else {
            flag = user.getUsername().equals(username) && user.getPassword().equals(password);
        }
        return flag;
    }
}
