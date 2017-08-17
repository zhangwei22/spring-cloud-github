package com.spring.cloud.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class Sc08TurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sc08TurbineApplication.class, args);
	}
}
