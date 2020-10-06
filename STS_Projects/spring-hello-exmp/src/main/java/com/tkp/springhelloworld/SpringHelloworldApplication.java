package com.tkp.springhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages  = "com.tkp.controller")
public class SpringHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloworldApplication.class, args);
	}

}
