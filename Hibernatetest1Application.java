package com.app3.hibernatetest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class Hibernatetest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Hibernatetest1Application.class, args);
		
		
	}

}
