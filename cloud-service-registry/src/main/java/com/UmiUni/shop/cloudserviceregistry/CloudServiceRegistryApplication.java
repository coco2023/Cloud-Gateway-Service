package com.UmiUni.shop.cloudserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServiceRegistryApplication.class, args);
	}

}
