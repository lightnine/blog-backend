package com.ll.blog.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author leon
 * @Date 2019/5/31 17:14
 */
@WebFilter(urlPatterns = "/*", filterName = "filterDemo")
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("执行时间：" + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {

    }
}
