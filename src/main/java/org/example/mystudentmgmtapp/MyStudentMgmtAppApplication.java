package org.example.mystudentmgmtapp;

import org.example.mystudentmgmtapp.model.Classroom;
import org.example.mystudentmgmtapp.model.Course;
import org.example.mystudentmgmtapp.model.Student;
import org.example.mystudentmgmtapp.model.Transcript;
import org.example.mystudentmgmtapp.repository.CourseRepository;
import org.example.mystudentmgmtapp.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class MyStudentMgmtAppApplication {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public MyStudentMgmtAppApplication(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtAppApplication.class, args);
    }

    public void saveStudent() {

        Transcript transcript = new Transcript("BS Computer Science");

        Classroom classroom = new Classroom("McLaughlin building", "M105");

        Course course1 = new Course("CS401", "Modern Prog Practices");
        Course course2 = new Course("CS425", "Software Engineering");

        courseRepository.save(course1);
        courseRepository.save(course2);


        Student student = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019, 05, 24));
        student.setTranscript(transcript);
        student.setClassroom(classroom);
        student.getCourses().add(course1);
        student.getCourses().add(course2);

        studentRepository.save(student);
    }

}
