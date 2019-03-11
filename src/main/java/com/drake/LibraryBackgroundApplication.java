package com.drake;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.drake.mapper")
@ComponentScan("com.drake.*")
public class LibraryBackgroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryBackgroundApplication.class, args);
	}

}
