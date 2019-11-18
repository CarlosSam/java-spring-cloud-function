package com.flama.javaSpringCloudFunction.javaspringcloudfunction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@SpringBootApplication
public class JavaSpringCloudFunctionApplication {

	private static final Logger log = LoggerFactory.getLogger(JavaSpringCloudFunctionApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringCloudFunctionApplication.class, args);
	}

	@Bean
	public Function<Map, Map> hello(){
		return input -> {
			log.info("hello with input: {}", input);
			Map output = new HashMap();
			output.put("greeting", "Hello " + input.get("name") + " from a map");
			return output;
		};
	}

}
