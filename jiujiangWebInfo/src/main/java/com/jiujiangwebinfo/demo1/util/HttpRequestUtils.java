package com.jiujiangwebinfo.demo1.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.net.URLCodec;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLDecoder;


public class HttpRequestUtils {
    private static Logger logger = LoggerFactory.getLogger(HttpRequestUtils.class);     //日志记录

    public static JSONObject httpPost(String url, JSONObject jsonParam) {
        return httpPost(url, jsonParam, false);
    }

    public static JSONObject httpPost(String url,JSONObject jsonParam,boolean noNeedResponse){
        //post请求返回结果
        HttpClient httpClient = HttpClientBuilder.create().build();
        JSONObject jsonResult = null;
        HttpPost method = new HttpPost(url);
        try {
            if(null != jsonParam){
                //解决中文乱码问题
                StringEntity entity = new StringEntity(jsonParam.toString(),"utf-8");
                entity.setContentEncoding("utf-8");
                entity.setContentType("application/json");
                method.setEntity(entity);
            }
            HttpResponse result = httpClient.execute(method);
            url = URLDecoder.decode(url,"utf-8");
            //请求发送成功，并获得响应
            if(result.getStatusLine().getStatusCode() == 200){
                String str = "";
                try {
                    //读取服务器返回过来的json字符串数据
                    str = EntityUtils.toString(result.getEntity());
                    if(noNeedResponse){
                        return null;
                    }
                    //把json字符串转换成json对象
                    jsonResult = JSONObject.parseObject(str);

                } catch (Exception e) {
                    logger.error("post请求失败:" + url,e);
                }
            }

        } catch (Exception e) {
            logger.error("post请求失败:" + url,e);
        }

        return jsonResult;
    }
}
