package com.example.spring_multple_datasource_batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringMultipleDatasourceBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMultipleDatasourceBatchApplication.class, args);
	}

}
