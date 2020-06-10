package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.repository.StudentRepository;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
@EntityScan( basePackages = {"com.example.*"} )
@EnableAutoConfiguration(exclude = { JpaRepositoriesAutoConfiguration.class })
@EnableJpaRepositories(basePackages = { "com.example.repository" })
@Import(StudentRepository.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
