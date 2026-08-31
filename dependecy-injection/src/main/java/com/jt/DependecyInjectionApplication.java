package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependecyInjectionApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(DependecyInjectionApplication.class, args);
	// Engine engine=context.getBean(Engine.class);
	// engine.stratEngine();

	Car car=context.getBean(Car.class);
	car.startCar();
	car.stopCar();
	}

}
