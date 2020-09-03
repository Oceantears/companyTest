package com.jiujiangwebinfo.demo1.util;

import com.alibaba.fastjson.JSONObject;

public class Main {
    public static void main(String[] args) {
        HttpRequestUtils1 utils1 = new HttpRequestUtils1();
        utils1.doGetTestOne();

//        String url = "http://192.168.0.20:9010/api/v1/orderInfo/order_list?modifyTime=2020-08-12%2012:00:00";
//        JSONObject object = HttpRequestUtils.httpGet(url);
//        System.out.println("=========响应对象============>" + object);
    }
}
