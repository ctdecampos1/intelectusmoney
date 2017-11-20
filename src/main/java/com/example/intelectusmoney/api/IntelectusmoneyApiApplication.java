package com.example.intelectusmoney.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication//(scanBasePackages={"com.example.intelectusmoney.api"})
@SpringBootApplication(scanBasePackages = {"boot.registration"} , exclude = JpaRepositoriesAutoConfiguration.class)
public class IntelectusmoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntelectusmoneyApiApplication.class, args) ;
	}
}
