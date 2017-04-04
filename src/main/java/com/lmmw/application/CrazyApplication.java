package com.lmmw.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lmmw") 
public class CrazyApplication extends SpringBootServletInitializer{
	public static void main(String[] args) throws Exception {
		SpringApplication.run(CrazyApplication.class, args);
		System.out.println("=========spring boot started!===========");
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CrazyApplication.class);
	}
}
