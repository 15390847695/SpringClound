package com.heit.goods.controller;

import com.heit.goods.req.Item;
import com.heit.goods.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{id}")
    public Item getGoodsInfo(@PathVariable("id")String id){
        return itemService.queryItemById(id);

    }

}
