package com.task01.UserRecord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({ "com.task01.UserRecord.Model" })
@EnableJpaRepositories(basePackages = { "com.task01.UserRecord.Repository" })
@ComponentScan(basePackages = { "com.task01.UserRecord" })
public class UserRecordApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRecordApplication.class, args);
		System.out.println("Hello World");
	}

}
