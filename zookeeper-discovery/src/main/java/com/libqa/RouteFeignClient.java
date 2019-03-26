package com.libqa;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(name = "zookeeper-provider")
public interface RouteFeignClient {
	
	@RequestMapping(path = "/helloworld", method = RequestMethod.GET)
    @ResponseBody
	String helloWorld();
	
	@RequestMapping(path = "/name", method = RequestMethod.GET)
    @ResponseBody
	String name();
	
	@RequestMapping(path = "/product", method = RequestMethod.GET)
    @ResponseBody
	String product();

	@RequestMapping(path = "/services", method = RequestMethod.GET)
	@ResponseBody
	List<String> services();
}