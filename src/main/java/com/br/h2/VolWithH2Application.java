package com.br.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class })
public class VolWithH2Application {

	public static void main(String[] args) {
		SpringApplication.run(VolWithH2Application.class, args);
	}

}
