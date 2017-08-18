package com.spring.cloud.github.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangwei on 17/8/18.
 */
@RestController
@RefreshScope
@RequestMapping(value = "test")
public class TestController {

    @Value("${from:spring cloud config!}")
    private String name;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home() {
        return "Hello " + name;
    }
}
