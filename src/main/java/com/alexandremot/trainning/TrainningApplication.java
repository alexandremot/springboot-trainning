package com.alexandremot.trainning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TrainningApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainningApplication.class, args);
	}

}
