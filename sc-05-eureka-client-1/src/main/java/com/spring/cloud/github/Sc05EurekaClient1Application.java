package com.spring.cloud.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Sc05EurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sc05EurekaClient1Application.class, args);
	}
}
