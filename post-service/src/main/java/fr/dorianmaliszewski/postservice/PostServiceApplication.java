package fr.dorianmaliszewski.postservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
public class PostServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostServiceApplication.class, args);
	}

}
