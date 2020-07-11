package com.heit.order.controller;
//

import com.heit.order.config.JdbcBeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private JdbcBeanConfig jdbcBeanConfig;
    @RequestMapping("/test")
    public String test(){
        String url=jdbcBeanConfig.getUrl();
        System.out.println("url"+url);
        return url;

    }
}
