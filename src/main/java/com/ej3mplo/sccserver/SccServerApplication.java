package com.ej3mplo.sccserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class SccServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SccServerApplication.class, args);
	}

}
