package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanLifeCycleApplication {

	public static void main(String[] args) {
	var context =	SpringApplication.run(BeanLifeCycleApplication.class, args);
	var greet = context.getBean(Greet.class);
	greet.greet();
	}

	/**
	 * ===Bean Life Cycle===
	 * 1.Bean Instansiated -Object is created-constructor
	 * 2.Dependency Injection(if available)
	 * 3.Bean initialized-@postConstruct
	 * 4.Bean used
	 * 5.Bean Destroyed
	 * --managed by spring container
	 */


}