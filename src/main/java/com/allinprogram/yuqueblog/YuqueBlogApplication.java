package com.allinprogram.yuqueblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class YuqueBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(YuqueBlogApplication.class, args);
	}
}
