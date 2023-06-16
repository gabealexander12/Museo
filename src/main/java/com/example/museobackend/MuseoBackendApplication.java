package com.example.museobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.example.museobackend")
public class MuseoBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuseoBackendApplication.class, args);
	}

}
