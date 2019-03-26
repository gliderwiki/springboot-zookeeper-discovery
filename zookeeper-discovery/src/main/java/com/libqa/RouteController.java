package com.libqa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RouteController {
	
	@Autowired
	private RouteDiscoveryClient routeDiscoveryClient;
	
	@GetMapping("/helloworld")
	public String greetings() {
		return routeDiscoveryClient.helloWorld();
	}
	
	@GetMapping("/name")
	public String name() {
		return routeDiscoveryClient.name();
	}
	
	@GetMapping("/product")
	public String product() {
		return routeDiscoveryClient.product();
	}

	@GetMapping("/services")
	public List<String> services() {
		return routeDiscoveryClient.services();
	}

}