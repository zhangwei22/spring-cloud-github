package com.spring.cloud.github.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangwei on 17/8/15.
 */
@RestController
@RequestMapping("helloWorld")
public class HelloWorldController {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("into index... host:{}, service-id:{}", instance.getHost(), instance.getServiceId());
        return "Hello world!";
    }
}
