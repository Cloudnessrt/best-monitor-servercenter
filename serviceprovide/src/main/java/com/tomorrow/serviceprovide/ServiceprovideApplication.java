package com.tomorrow.serviceprovide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.tomorrow.serviceprovide.Dao")
public class ServiceprovideApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServiceprovideApplication.class, args);
	}

}
