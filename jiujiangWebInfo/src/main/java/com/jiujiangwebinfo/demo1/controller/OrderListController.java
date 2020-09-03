package com.jiujiangwebinfo.demo1.controller;

import com.jiujiangwebinfo.demo1.entity.OrderList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/orderInfo")
public class OrderListController {
    @GetMapping("order_list")
    public void order_list(OrderList orderList){
        System.out.println("================" + orderList);
    }
}
