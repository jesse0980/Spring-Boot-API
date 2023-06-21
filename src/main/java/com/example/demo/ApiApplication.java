package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
    @RestController
    public class HomeController {
        @GetMapping("/")
        public String home() {
            return "Hello, world!";
        }
        @GetMapping("/name")
        public String getName() {
        	return "Jesse";
        }
        @GetMapping("/erroor")
        public String getError() {
        	return "error";
        }
    } 

}