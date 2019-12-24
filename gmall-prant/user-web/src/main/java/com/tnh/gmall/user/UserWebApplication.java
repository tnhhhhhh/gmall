package com.tnh.gmall.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: TNH
 * @create: 2019/12/23 19:15
 */
@SpringBootApplication
@EnableDubbo
public class UserWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserWebApplication.class,args);
    }
}
