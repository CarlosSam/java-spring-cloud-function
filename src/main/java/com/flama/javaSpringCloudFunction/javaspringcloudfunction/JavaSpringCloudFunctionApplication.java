package com.flama.javaSpringCloudFunction.javaspringcloudfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.function.Function;

@SpringBootApplication
public class JavaSpringCloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringCloudFunctionApplication.class, args);
	}

	@Bean
	public Function<String, String> hello(){
		return name -> {
			return "Hello " + name;
		};
	}

}
