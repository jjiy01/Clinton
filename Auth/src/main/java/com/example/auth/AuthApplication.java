package com.example.auth;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableResourceServer
@RestController
public class AuthApplication {

	@RequestMapping("/user")
	public Principal getUser(Principal principal) {
		return principal;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}
}
