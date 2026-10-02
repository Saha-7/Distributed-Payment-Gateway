package com.saha7pritam.razorpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RazorpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RazorpayApplication.class, args);
		System.out.println("Razorpay Application is running...");
	}

}
