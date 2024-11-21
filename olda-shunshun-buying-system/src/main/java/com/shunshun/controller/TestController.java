package com.shunshun.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @author ：Zhuiwei Wu
 * @description：TODO
 * @date ：2024-11-20 16:05
 */
@RestController
@Api(tags = "测试接口")

public class TestController {
    @GetMapping("/hello")
    public String sendHello(){
        return "hello";
    }
}
