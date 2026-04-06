package com.cob;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunnerAppApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationRunnerAppApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ApplicationRunnerAppApplication is running...");
		System.out.println("It ran before any controller method execute");
	}
}
