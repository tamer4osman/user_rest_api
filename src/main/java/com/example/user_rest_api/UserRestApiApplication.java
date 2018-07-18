package com.example.user_rest_api;

import com.example.user_rest_api.model.User;
import com.example.user_rest_api.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserRestApiApplication {

	public static void main(String[] args) {
		SpringApplication. run(UserRestApiApplication. class, args);
	}
	//create some default data when our application begins
	@Bean
	CommandLineRunner initData(UserRepository UserRepo){
		return args -> {
			UserRepo .save(new User(10, "Tamer", 42));
			UserRepo .save(new User(12, "najmi", 40));
		};
	}
}
