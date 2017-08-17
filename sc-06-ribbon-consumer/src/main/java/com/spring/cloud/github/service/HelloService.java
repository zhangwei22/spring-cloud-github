package com.spring.cloud.github.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhangwei on 17/8/17.
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    /**
    * 当轮询到无法访问的进程的时候会输出error
    * Hystrix默认的超时时间是2000ms，也就是说如果2s没有返回结果就会输出error
    * */
    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String helloService() {
        return restTemplate.getForEntity("http://EUREKA-CLIENT/helloWorld/index", String.class).getBody();
    }

    public String helloFallBack() {
        return "error";
    }
}
