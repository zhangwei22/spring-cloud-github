package com.spring.cloud.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Sc11ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sc11ConfigServerApplication.class, args);
	}
}
