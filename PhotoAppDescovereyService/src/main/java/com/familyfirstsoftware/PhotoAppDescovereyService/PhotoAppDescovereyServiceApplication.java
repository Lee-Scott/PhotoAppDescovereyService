package com.familyfirstsoftware.PhotoAppDescovereyService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PhotoAppDescovereyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppDescovereyServiceApplication.class, args);
	}

}
