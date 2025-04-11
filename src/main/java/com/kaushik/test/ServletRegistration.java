package com.kaushik.test;

import java.beans.JavaBean;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kaushik.test.servlet.Test;

@Configuration
public class ServletRegistration {

    @Bean
    public ServletRegistrationBean<Test> register() {
        return new ServletRegistrationBean<>(new Test(), "/add");
    }
}
