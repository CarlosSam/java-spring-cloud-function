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
	public Function<Input, Output> hello(){
		return input -> {
			log.info("calling hello with input {}", input);
			Output output = new Output();
			output.setGreeting("Hello " + input.getName() + ", from custom type");
			return output;
		};
	}

}

class Input {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Output {
	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
