package com.spring.cloud.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Sc04EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sc04EurekaClientApplication.class, args);
	}
}
