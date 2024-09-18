package com.microservicio.cliente_persona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.microservicio.cliente_persona")
@EnableJpaRepositories(basePackages="com.microservicio.cliente_persona.repository")
public class ClientePersonaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientePersonaApplication.class, args);
	}

}
