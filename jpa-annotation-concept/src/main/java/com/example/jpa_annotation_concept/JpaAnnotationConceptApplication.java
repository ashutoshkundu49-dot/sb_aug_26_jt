package com.example.jpa_annotation_concept;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor 
public class JpaAnnotationConceptApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaAnnotationConceptApplication.class, args);
	}
	private  final EmployeeRepository repository;


	@Bean 
	public CommandLineRunner commandLineRunner(){
		return args->{
			// Employee employee=new Employee(null,"Name 1","dec 1",1000.99)
			System.out.println("command line run method");
			Employee employee=Employee.builder()
			                        .name("Ranjit")
									.description("he is a loyal employee")
									.salary(BigDecimal.valueOf(45000))
									.status(EmployeeStatus.ACTIVE)
									.build();

      Employee emp=  repository.save(employee);

	   Employee savedEmployee=repository
	                     .findById(emp.getId())
	                  .orElseThrow();

		// System.out.println("saved employee"+savedEmployee);
		savedEmployee.setName("Ankit kumar");
		savedEmployee.setDescription("Ankit is a good guy");	
		repository.save(savedEmployee);	  
		};
	}

}
