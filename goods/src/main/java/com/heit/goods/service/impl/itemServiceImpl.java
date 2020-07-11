package com.heit.goods.service.impl;

import com.heit.goods.req.Item;
import com.heit.goods.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class itemServiceImpl implements ItemService {

    private static Map<String,Item> map=new HashMap<String,Item>();
    static {
        map.put("1",new Item("1","2500","茅台","www.baidu.com"));
        map.put("2",new Item("2","1500","五粮","www.baidu.com"));
        map.put("3",new Item("3","500","梦之蓝","www.baidu.com"));
        map.put("4",new Item("4","200","四特","www.baidu.com"));
        map.put("5",new Item("5","100","堆花","www.baidu.com"));
    }

    @Override
    public Item queryItemById(String id) {
        return map.get(id);
    }
}
