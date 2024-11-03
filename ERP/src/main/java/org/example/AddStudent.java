package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Student class to hold student details
class AddStudent {
    private int id;
    private String name;
    private int age;

    // Constructor
    public AddStudent(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters for student attributes
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Display student information
    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}


