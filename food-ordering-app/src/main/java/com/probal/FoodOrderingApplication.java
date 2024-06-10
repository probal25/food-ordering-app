package com.probal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FoodOrderingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderingApplication.class, args);
	}

}
