package com.kartohan.kartohan_todo_list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class KartohanTodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(KartohanTodoListApplication.class, args);
	}

}
