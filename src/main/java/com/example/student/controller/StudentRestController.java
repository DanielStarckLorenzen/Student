package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> students() {
        return studentRepository.findAll();
    }

    @GetMapping("/testStudent")
    public List<Student> addStudent() {
        Student s1 = new Student();
        s1.setName("Viggo");
        s1.setBornDate(LocalDate.now());
        s1.setBornTime(LocalTime.now());
        studentRepository.save(s1);
        System.out.println("Saved!");


        return studentRepository.findAll();
    }

}
