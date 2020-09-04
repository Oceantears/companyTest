package com.jiujiangwebinfo.demo1.util;

import com.jiujiangwebinfo.demo1.entity.User;
import com.jiujiangwebinfo.demo1.service.impl.UserService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import com.jiujiangwebinfo.demo1.entity.Order;
import com.jiujiangwebinfo.demo1.service.impl.OrderListService;
import net.sf.json.JsonConfig;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;


public class HttpRequestUtils1 {
    /**
     * GET无参方式
     */
    public void doGetTestOne(){
        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        // 创建Get请求
        HttpGet httpGet = new HttpGet("http://192.168.0.20:9010/api/v1/orderInfo/order_list?modifyTime=2020-08-12%2012:00:00");
//        HttpGet httpGet = new HttpGet("http://www.baidu.com");
        //响应模型
        CloseableHttpResponse response = null;


        OrderListService orderListService = new OrderListService();


        try {
            // 由客户端执行(发送)Get请求
            response = httpClient.execute(httpGet);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();
            System.out.println("响应状态为：" + response.getStatusLine());

            if(responseEntity != null){
//                System.out.println("响应内容长度为：" + responseEntity.getContentLength());
                //设置编码防止响应乱码
                String responseStr = EntityUtils.toString(responseEntity, StandardCharsets.UTF_8);
                //System.out.println("响应内容为：" + responseStr);
                JSONObject data = JSONObject.fromObject(responseStr);
                System.out.println(data.toString());
                JSONArray jsonArray = data.getJSONObject("data").getJSONArray("records");
                Order order;

                /**
                 * 将order对象中的时间转化成“yyyy-MM-dd HH:mm:ss”格式
                 */
                JsonConfig jsonConfig = new JsonConfig();
                jsonConfig.registerJsonValueProcessor(Date.class,new JsonValueProcessorImpl());


                for (Object o : jsonArray) {
                    System.out.println("============order============" + o);
                    order = com.alibaba.fastjson.JSONObject.parseObject(o.toString(),Order.class);

                    JSONObject jsonFromBean = JSONObject.fromObject(order,jsonConfig);
                    orderListService.insert(order);


                }
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                //释放资源
                if(httpClient != null){
                    httpClient.close();
                }
                if(response != null){
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * GET有参(方式一：直接拼接URL)
     */

}
