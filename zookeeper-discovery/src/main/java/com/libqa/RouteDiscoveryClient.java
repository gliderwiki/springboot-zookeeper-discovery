package com.libqa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class RouteDiscoveryClient {
	
	@Autowired
	private RouteFeignClient feign;
	
	public String helloWorld() {
		return feign.helloWorld();
	}
	
	public String name() {
		return feign.name();
	}
	
	public String product() {
		return feign.product();
	}

	public List<String> services() {
		return feign.services();
	}

}
