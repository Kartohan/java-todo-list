package com.kartohan.kartohan_todo_list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KartohanTodoListApplication {

	public static void main(String[] args) {
		EnvLoader.loadEnv();
		SpringApplication.run(KartohanTodoListApplication.class, args);
	}
}