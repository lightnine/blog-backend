package com.ll.blog.interceptor;

import com.ll.blog.entity.SysLog;
import com.ll.blog.entity.SysView;
import com.ll.blog.service.SysService;
import com.ll.blog.util.BrowserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * 前台拦截器
 * 说明：主要是获取访问的一些统计量
 * @Author leon
 * @Date 2019/5/31 22:06
 */
public class ForeInterceptor implements HandlerInterceptor {
    @Autowired
    SysService sysService;

    private SysLog sysLog = new SysLog();
    private SysView sysView = new SysView();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /** 获取访问者 IP, URL, browser*/
        String ip = request.getRemoteAddr();
        String url = request.getRequestURL().toString();
        String browser = BrowserUtil.getOsAndBrowserInfo(request);
        // 准备统计数据，因为只有在postHandle中可以获取到访问的是哪个方法，所以sysLog数据在postHandle入库
        sysLog.setIp(StringUtils.isEmpty(ip) ? "0.0.0.0": ip);
        sysLog.setOperateUrl(StringUtils.isEmpty(url) ? "获取url失败" : url);
        sysLog.setOperateBy(StringUtils.isEmpty(browser) ? "获取浏览器失败" : browser);
        sysView.setIp(StringUtils.isEmpty(ip) ? "0.0.0.0" : ip);
        sysService.addView(sysView);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            // 记录访问的方法
            sysLog.setRemark(method.getName());
            // 入库
            sysService.addLog(sysLog);
        } else {
            String uri = request.getRequestURI();
            sysLog.setRemark(uri);
            sysService.addLog(sysLog);
        }
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
