package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringbootDemoApp {
	
    @GetMapping("/hello")
    public String hello() {
    	return "Hello HI HOW R U?????????"
    			+ "WHAT IS GOING ON????";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApp.class, args);
    }

}
