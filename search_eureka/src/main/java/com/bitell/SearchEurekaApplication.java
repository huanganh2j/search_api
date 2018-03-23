package com.bitell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SearchEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchEurekaApplication.class, args);
	}
}
