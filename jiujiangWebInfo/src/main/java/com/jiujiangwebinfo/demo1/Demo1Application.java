package com.jiujiangwebinfo.demo1;

import com.jiujiangwebinfo.demo1.entity.User;
import com.jiujiangwebinfo.demo1.service.impl.UserService;
import com.jiujiangwebinfo.demo1.util.HttpRequestUtils1;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.jiujiangwebinfo.demo1.mapper")
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
