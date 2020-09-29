package com.anibjoshi.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftTestApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Openshift";
	}
	
	@GetMapping("/{input}")
	public String welcome(@PathVariable String input) {
		return "Hi "+ input + " Your application deployed successfully";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftTestApplication.class, args);
	}

}
