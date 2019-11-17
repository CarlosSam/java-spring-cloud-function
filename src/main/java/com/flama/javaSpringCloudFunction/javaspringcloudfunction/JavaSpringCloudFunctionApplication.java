package com.flama.javaSpringCloudFunction.javaspringcloudfunction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.function.Function;

@SpringBootApplication
public class JavaSpringCloudFunctionApplication {

	private static final Logger log = LoggerFactory.getLogger(JavaSpringCloudFunctionApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringCloudFunctionApplication.class, args);
	}

	@Bean
	public Function<String, String> hello(){
		return name -> {
			log.info("calling hello with input {}", name);
			return "Hello " + name;
		};
	}

}
