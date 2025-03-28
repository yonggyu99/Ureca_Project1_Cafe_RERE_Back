package com.shop.cafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:config/secu.properties")
public class UrecaProject1CafeRereApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrecaProject1CafeRereApplication.class, args);
	}

}
