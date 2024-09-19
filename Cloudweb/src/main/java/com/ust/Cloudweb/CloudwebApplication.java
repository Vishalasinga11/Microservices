package com.ust.Cloudweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudwebApplication.class, args);
	}

}
