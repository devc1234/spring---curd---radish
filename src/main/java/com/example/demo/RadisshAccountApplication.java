package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@EnableCaching
@SpringBootApplication
public class RadisshAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadisshAccountApplication.class, args);
	}

}
