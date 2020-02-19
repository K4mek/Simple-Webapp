package com.example.simple;

import com.example.simple.web.ParamController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@SpringBootApplication same as @EnableAutoConfiguration, @ComponentScan and @configuration
@EnableAutoConfiguration
@Configuration
@Import( {ParamController.class} )
public class SimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}

}
