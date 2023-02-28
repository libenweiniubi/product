package com.calb.es;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.calb.es.mapper")
public class EStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(EStorageApplication.class, args);
	}

}
