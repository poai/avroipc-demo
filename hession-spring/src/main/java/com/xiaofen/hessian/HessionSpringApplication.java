package com.xiaofen.hessian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = "spring.xml")
public class HessionSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(HessionSpringApplication.class, args);
	}
}
