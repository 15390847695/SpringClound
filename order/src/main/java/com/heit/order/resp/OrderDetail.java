package com.heit.order.resp;

import lombok.Data;

@Data
public class OrderDetail {
    private String OrderId;
    private Item item;

}
