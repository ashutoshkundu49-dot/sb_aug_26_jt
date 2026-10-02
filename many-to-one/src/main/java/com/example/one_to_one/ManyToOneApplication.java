package com.example.one_to_one;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collection;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class ManyToOneApplication {

    private final SubjectRepository subjectRepository;
    private final TeacherRepository teacherRepository;

    public static void main(String[] args) {
        SpringApplication.run(ManyToOneApplication.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args->{
//           onewayBinding();
            //Inverse side
//
//            Teacher newTeacher=Teacher.builder()
//                    .teacherName("smurti sir")
//                    .build();
//
//
//            Subject subject1=Subject.builder()
//                    .subjectName("python")
//                    .teacher(newTeacher)
//                    .build();

//            Subject subject2=Subject.builder()
//                    .subjectName("Css")
//                    .teacher(newTeacher)
//                    .build();
//
//            Subject subject3=Subject.builder()
//                    .subjectName(" js")
//                    .teacher(newTeacher)
//                    .build();

//         newTeacher.setSubjects(List.of(subject1,subject2,subject3));
//            newTeacher.setSubjects(List.of(subject1));
//         teacherRepository.save(newTeacher);
//
//         //Extract
//            teacherRepository.findById(1)
//                    .orElseThrow()
//                    .getSubjects()
//                    .forEach(sub->{
//                        System.out.println(sub.getTeacher().getTeacherName()+"\t\t"+sub.getSubjectName());
//                    });

            //Update
            Teacher existingTeacher=teacherRepository.findById(2).orElseThrow();
            existingTeacher.setTeacherName("Sai Pranab Patra");


            //Delete
//            teacherRepository.deleteById(2);





//
        };
    }

    private void onewayBinding(){
        //save

//        Teacher teacher=Teacher.builder()
//                .teacherName("Amit")
//                .build();
//
//        Subject subject1=Subject.builder()
//                .subjectName("C")
//                .teacher(teacher)
//                .build();
//
//        Subject subject2=Subject.builder()
//                .subjectName("C++")
//                .teacher(teacher)
//                .build();
//
//        Subject subject3=Subject.builder()
//                .subjectName(" java")
//                .teacher(teacher)
//                .build();
//
//
//        subjectRepository.saveAll(List.of(subject1,subject2,subject3));
//
//        //Extract
//
//        subjectRepository.findAll().forEach((sub)->{
//            System.out.println(sub.getSubjectName()+"\t->\t"+sub.getTeacher().getTeacherName());
//        });

//        //Update
//        Subject existingSubject=subjectRepository.findById(6).orElseThrow();
//        existingSubject.setSubjectName("Core java");
//
//
//        Teacher teacherAssociatewithid6=existingSubject.getTeacher();
//        teacherAssociatewithid6.setTeacherName("Rashmi");
//
//        subjectRepository.save(existingSubject);


        //Remove

//        subjectRepository.deleteById(1);

    }

}
