package com.practiceDocker.practiceDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

@SpringBootApplication
public class PracticeDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeDockerApplication.class, args);
	}
		
	@GetMapping("/get")
	public String getData(){
		return "Hello-Developers";					
	}

}
