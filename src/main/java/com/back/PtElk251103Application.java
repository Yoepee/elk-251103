package com.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PtElk251103Application {

	public static void main(String[] args) {
		SpringApplication.run(PtElk251103Application.class, args);
	}

}
