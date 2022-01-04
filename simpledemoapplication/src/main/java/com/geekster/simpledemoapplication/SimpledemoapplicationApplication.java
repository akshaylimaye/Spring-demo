package com.geekster.simpledemoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.geekster.*")
public class SimpledemoapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpledemoapplicationApplication.class, args);
	}

}
