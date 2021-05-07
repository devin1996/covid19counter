package io.vira.covid19counter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Covid19CounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19CounterApplication.class, args);
	}

}
