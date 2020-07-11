package com.heit.order.service.impl;

import com.heit.order.config.OrderConfig;
import com.heit.order.resp.Item;
import com.heit.order.resp.Order;
import com.heit.order.resp.OrderDetail;
import com.heit.order.service.OrderService;
import com.sun.deploy.ui.DialogTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class OrderServiceimpl implements OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("order.goods.url")
    private String  itemUrl;

    @Autowired
    private OrderConfig orderConfig;

    @Override
    public Order createOrder() {
        Order order =new Order();
        order.setUserId("test01");

        String orderId=String.valueOf(System.currentTimeMillis());
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setOrderId(orderId);
        String goodsId="1";
        //String url1=orderConfig.getItemUrl();
       // String url="http://192.168.1.101:7080/item/"+goodsId;
       // String url=url1+"/item/"+goodsId;
        String url="http://heit-goods/item/"+goodsId;
       Item item= restTemplate.getForObject(url, Item.class);
        System.out.println("==================="+item);

        orderDetail.setItem(item);
        order.setOrderDetail(orderDetail);

   return order;
    }
}
