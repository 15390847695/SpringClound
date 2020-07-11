package com.heit.order.resp;

import lombok.Data;

@Data
public class Order {
    private String orderId;

    private String userId;

    private OrderDetail orderDetail;


}
