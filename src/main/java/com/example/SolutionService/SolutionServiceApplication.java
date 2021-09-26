package com.example.SolutionService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SolutionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolutionServiceApplication.class, args);
	}

}
