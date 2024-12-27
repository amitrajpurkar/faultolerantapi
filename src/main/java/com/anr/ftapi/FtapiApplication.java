package com.anr.ftapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class FtapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtapiApplication.class, args);
	}

	@GetMapping("/hi")
	public String requestMethodName(@RequestParam( defaultValue = "world") String q) {
		return new String("hello "+q);
	}
	

}