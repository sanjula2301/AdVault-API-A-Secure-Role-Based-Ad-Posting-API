package com.example.SpringSecurityExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringSecurityExampleApplication {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new int[]{2, 4, 5, 2, 3}));
		SpringApplication.run(SpringSecurityExampleApplication.class, args);
	}

}
