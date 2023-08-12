package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner cmd(ApplicationContext ctx) {
		return args -> {
			String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
			for (String string : beanDefinitionNames) {
				// System.out.println(string); // list out all beans
			}

		};
	}
}
