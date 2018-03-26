package com.bitell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SearchApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchApiApplication.class, args);
	}
}
