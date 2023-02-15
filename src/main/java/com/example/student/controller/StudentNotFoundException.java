package com.example.student.controller;

import com.example.student.model.Student;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String name) {
        super("Student not found: " + name);
    }

}
