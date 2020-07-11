package com.heit.order.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
   private String id;

   private String price;

   private String name;

   private String pic;
}
