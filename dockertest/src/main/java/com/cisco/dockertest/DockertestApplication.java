package com.cisco.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockertestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockertestApplication.class, args);
		System.out.println("Name: vineetha");
		System.out.println("Message: Hello world");
	}

}
