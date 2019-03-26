package com.libqa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApiApplication.class, args);
	}
}