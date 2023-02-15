package com.example.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {
    @Id
    private int id;
    private String name;
    private int age;
}
