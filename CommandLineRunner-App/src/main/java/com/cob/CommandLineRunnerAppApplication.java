package com.cob;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineRunnerAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CommandLineRunnerAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunnerAppApplication is running...");
		System.out.println("It ran before any controller method execute");
	}
}
