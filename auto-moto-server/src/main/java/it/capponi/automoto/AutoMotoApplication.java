package it.capponi.automoto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"it.capponi.automoto"})
@EnableJpaRepositories(basePackages= {"it.capponi.automoto.repository"})
@EntityScan(basePackages= {"it.capponi.automoto.model"})

public class AutoMotoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoMotoApplication.class, args);
	}

}
