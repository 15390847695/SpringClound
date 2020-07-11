package com.heit.order.controller;

import com.heit.order.resp.Order;
import com.heit.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @RequestMapping("/create")
    public Order CreateOrder(){

        Order order=orderService.createOrder();
        return order;
    }

}
