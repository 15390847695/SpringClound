package com.heit.eureka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class WebSecuritConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
       httpSecurity.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER);
       httpSecurity.csrf().disable();
       httpSecurity.authorizeRequests().anyRequest().anonymous().and().httpBasic();
        super.configure(httpSecurity);
    }
}
