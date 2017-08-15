package com.spring.cloud.github.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangwei on 17/8/15.
 */
@RestController
@RequestMapping("helloWorld")
public class HelloWorldController {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @Value("${book.name}")
    private String name;

    @Value("${book.value}")
    private String value;

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        logger.info("into index...");
        logger.info("NAME:{}, VALUE:{}", name, value);
        return "Hello world!";
    }
}
