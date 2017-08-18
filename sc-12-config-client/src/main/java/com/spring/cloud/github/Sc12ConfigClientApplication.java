package com.spring.cloud.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
//@SpringBootApplication
public class Sc12ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sc12ConfigClientApplication.class, args);
    }
}
