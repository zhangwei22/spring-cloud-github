package com.spring.cloud.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Sc03EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sc03EurekaServerApplication.class, args);
	}
}
