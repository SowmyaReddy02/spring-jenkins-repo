package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {
	
	@GetMapping("ping")
	public String message() {
		return "Spring jenkins project integrated";
 	}
	@GetMapping("ping/{name}")
	public String mess(@PathVariable String name) {
		return "Welcome "+name;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
