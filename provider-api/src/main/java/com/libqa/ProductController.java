package com.libqa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

	@Value("${server.port}")
	private String serverPort;
	@Value("${spring.application.name}")
	private String instanceName;

	private final DiscoveryClient discoveryClient;

	public ProductController(DiscoveryClient discoveryClient) {
		this.discoveryClient = discoveryClient;
	}

	@GetMapping("/product")
	public String product() {
		return "provider1-product";
	}

	@GetMapping("/service-list")
	public List<String> serviceList() {
		List<ServiceInstance> instances = discoveryClient.getInstances(instanceName);

		List<String> services = discoveryClient.getServices();

		if (instances != null && instances.size() > 0) {
			instances.forEach(serviceInstance -> services.add(serviceInstance.getUri().toString()));
		}

		return services;
	}

}