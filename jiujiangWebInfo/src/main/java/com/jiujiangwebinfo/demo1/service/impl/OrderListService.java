package com.jiujiangwebinfo.demo1.service.impl;

import com.jiujiangwebinfo.demo1.entity.Order;
import com.jiujiangwebinfo.demo1.mapper.OrderListMapper;
import com.jiujiangwebinfo.demo1.service.IOrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderListService implements IOrderListService {

    @Autowired
    private OrderListMapper orderListMapper;

    @Override
    public void insert(Order order) {

        System.out.println("==========添加了order===========" + order);
        //orderListMapper.insert(order);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
}
