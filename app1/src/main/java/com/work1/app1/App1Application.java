package com.work1.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App1Application {

	public static void main(String[] args) {
		System.out.printf("Hello World");
		SpringApplication.run(App1Application.class,args);
	}

}
