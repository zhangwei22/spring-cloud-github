package com.spring.cloud.github.web;

import com.spring.cloud.github.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhangwei on 17/8/15.
 */
@RestController
public class ConsumerController {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "helloConsumer", method = RequestMethod.GET)
    public String helloConsumer() {
        //return restTemplate.getForEntity("http://EUREKA-CLIENT/helloWorld/index", String.class).getBody();
        return helloService.helloService();
    }

}
