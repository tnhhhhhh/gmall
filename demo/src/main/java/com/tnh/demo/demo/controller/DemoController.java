package com.tnh.demo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: TNH
 * @create: 2019/12/23 11:27
 */
@RestController
public class DemoController {
    @RequestMapping("/demo")
    public String demo(){
        return "hello demo";
    }
}
