package com.jt.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.Teacher;
@ImportResource("beans.xml")
@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class HelloApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(HelloApplication.class, args);

		//1.by using xml files
		 Greet greet=context.getBean(Greet.class);
		 greet.sayHello();
		 System.out.println("hello springboot");

        //3.by using configuration clause
		Student student=context.getBean(Student.class);
		student.sayHello();


		Teacher teacher=context.getBean(Teacher.class);
		teacher.sayHello();

		System.out.println(teacher.hashCode());
	}
  
  
}
