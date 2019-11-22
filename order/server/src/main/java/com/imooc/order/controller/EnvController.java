package com.imooc.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 廖师兄
 * 2018-01-21 21:57
 */
@RestController
@RequestMapping("/env")
@RefreshScope
public class EnvController {
    /**
     * 在bootstrap.yml文件中只能够这样配置profile: dev
     * 否则这里是会报错的
     */
    @Value("${env}")
    private String env;

    @GetMapping("/print")
    public String print() {
        return env;
    }
}
