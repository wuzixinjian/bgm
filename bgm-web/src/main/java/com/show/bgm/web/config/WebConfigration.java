package com.show.bgm.web.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebConfigration implements WebMvcConfigurer {



    /***
     * 拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                				System.out.println(request.getRequestURL());
                System.out.println(response.getWriter());
                return HandlerInterceptor.super.preHandle(request, response, handler);
            }

        });
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
