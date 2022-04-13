package com.ehsproy.msProducs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsProducsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProducsApplication.class, args);
	}

}
