package com.spring.reviewsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.spring.reviewsystem","com.ritwik.dao.service"})
public class ReviewsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewsystemApplication.class, args);
	}
}
