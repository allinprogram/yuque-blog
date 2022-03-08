package com.allinprogram.yuqueblog;

import com.allinprogram.yuqueblog.component.UserComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YuqueBlogApplication {

	@Autowired
	private static UserComponent userComponent;

	public static void main(String[] args) {
		SpringApplication.run(YuqueBlogApplication.class, args);
	}

}
