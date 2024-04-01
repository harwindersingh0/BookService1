package com.example.BookService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BookServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}
}
