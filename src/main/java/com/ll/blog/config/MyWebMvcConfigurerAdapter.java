package com.ll.blog.config;

import com.ll.blog.interceptor.BackInterceptor;
import com.ll.blog.interceptor.ForeInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.List;

/**
 * 说明：更改编码为UTF-8
 * @Author leon
 * @Date 2019/5/31 16:48
 */
@Configuration
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {
    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return converter;
    }
    @Bean
    public HandlerInterceptor getForInterceptor() {
        return new ForeInterceptor();
    }
    @Bean
    public HandlerInterceptor getBackInterceptor() {
        return new BackInterceptor();
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(responseBodyConverter());
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/toLogin").setViewName("ll/login.html");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getBackInterceptor()).addPathPatterns("/admin/**").excludePathPatterns("/toLogin", "/admin/login");
        registry.addInterceptor(getForInterceptor()).addPathPatterns("/**").excludePathPatterns("/toLogin", "/admin/**", "/js/**", "/css/**", "/img/**");
    }
}
