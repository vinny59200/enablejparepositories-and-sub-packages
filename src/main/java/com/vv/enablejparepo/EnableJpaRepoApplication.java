package com.vv.enablejparepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class EnableJpaRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnableJpaRepoApplication.class, args);
	}

}
