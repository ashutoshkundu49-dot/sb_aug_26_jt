package com.example.one_to_one;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class OneToOneApplication {

	private final StudentRepository studentRepository;
	private final AddressRepository addressRepository;

	public static void main(String[] args)

	{
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){

        return args -> {
//             owingSideOperaton();

			//Inverse Side Operation

         //-Add data to the database

//			Student newStudent=Student.builder()
//					.studentName("Ashutosh1")
//					.studentEmail("A1@gmail.com")
//					.build();
//
//			Address newAddress=Address.builder()
//					.city("Bhadrak")
//					.state("Odisha")
//					.country("India")
//					.student(newStudent)
//					.build();
//
//			newStudent.setAddress(newAddress);
//
//			addressRepository.save(newAddress);


//			//-Extract data
//			Address addresswithId4=addressRepository.findById(4).orElseThrow();
//			System.out.println("city :- "+addresswithId4.getCity());
//			System.out.println("state :-"+addresswithId4.getState());
//			System.out.println("country :- "+addresswithId4.getCountry());
//
//			Student studentwithaddressid4=addresswithId4.getStudent();
//			System.out.println("student name:-"+studentwithaddressid4.getStudentName());
//			System.out.println("student Email:-"+studentwithaddressid4.getStudentEmail());
//			System.out.println("student roll :-"+studentwithaddressid4.getStudentRoll());


//			//-Update
//			Address existingAdress=addressRepository.findById(4).orElseThrow();
//			existingAdress.setCountry("USA");
//			existingAdress.setState("USA-Demo");
//			existingAdress.setCity("Usa-Demo-2");
//
//			Student existingStudent=existingAdress.getStudent();
//			existingStudent.setStudentName("Deeild bravis");
//			existingStudent.setStudentEmail("d@gmail.com");
//
//			addressRepository.save(existingAdress);


			//-Remove by id
			addressRepository.deleteById(3);


		};

    }
	  private void owingSideOperaton(){
		  Address address=Address.builder()
				  .city("Bhadrak")
				  .state("Odisha")
				  .country("India")
				  .build();


		  Student student=Student.builder()
				  .studentName("Ashutosh")
				  .studentEmail("A@gmail.com")
				  .address(address)
				  .build();


//		   studentRepository.save(student);//because when we try to save owing side ,reverse side must be present in the database


		  //1.Manually save Address Object then save Student Object
//			 addressRepository.save(address);
//			 studentRepository.save(student);

		  //2.use Cascading
// 			studentRepository.save(student);

		  //UPDATE
//			Student existingStudent=studentRepository.findById(5).orElseThrow();
//			existingStudent.setStudentName("Baladev6");
//			existingStudent.setStudentEmail("b6@gmail.com");
//			Address existingAddress=existingStudent.getAddress();
//			existingAddress.setCity("foreign");
//////			addressRepository.save(existingAddress);
////
//			studentRepository.save(existingStudent);

		  //REMOVE
//			studentRepository.deleteById(5);

		  //Retrive
//			Student studentwithRoll6=studentRepository.findById(6).orElseThrow();
//			System.out.println("student name"+studentwithRoll6.getStudentName());
//			System.out.println("student email"+studentwithRoll6.getStudentEmail());
//
//
//			Address studentWithRoll6Address=studentwithRoll6.getAddress();
//			System.out.println("Address city"+studentWithRoll6Address.getCity());
//			System.out.println("Address state"+studentWithRoll6Address.getState());
//			System.out.println("Address country"+studentWithRoll6Address.getCountry());
	  }

}
