package com.example.todo_service;

import io.hypersistence.utils.spring.repository.BaseJpaRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(
		value = "com.example.todo_service.repository",
		repositoryBaseClass = BaseJpaRepositoryImpl.class
)
public class TodoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoServiceApplication.class, args);
	}

}
