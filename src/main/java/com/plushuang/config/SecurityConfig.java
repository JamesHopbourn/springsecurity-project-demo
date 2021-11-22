package com.plushuang.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        //在这里定制请求的授权规则

        //首页所有可以访问
        httpSecurity.authorizeRequests().antMatchers("/").permitAll();


    }
}
