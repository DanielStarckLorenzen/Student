package com.example.student.config;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        if (3>4) {
            Student s1 = new Student();
            s1.setId(1);
            s1.setName("Viggo");
            s1.setBornDate(LocalDate.now());
            s1.setBornTime(LocalTime.now());
            studentRepository.save(s1);
            System.out.println("Saved!");
            List<Student> lst = studentRepository.findAll();
            System.out.println("Antal studerende i databasen = " + lst.size());
            s1.setId(2);
            s1.setName("Viggo2");
            studentRepository.save(s1);
            System.out.println("Saved!");
            lst = studentRepository.findAll();
            System.out.println("Antal studerende i databasen = " + lst.size());
        }

    }
}
