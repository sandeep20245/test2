package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddStudentManager {
    private List<AddStudent> students;

    // Constructor initializing the student list
    public AddStudentManager() {
        students = new ArrayList<>();
    }

    // Method to add a new student
    public void addStudent(int id, String name, int age) {
        AddStudent newStudent = new AddStudent(id, name, age);
        students.add(newStudent);
        System.out.println("Student added successfully: " + newStudent);
    }

    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("List of Students:");
            for (AddStudent student : students) {
                System.out.println(student);
            }
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddStudentManager manager = new AddStudentManager();

        System.out.println("Welcome to the Student Manager Program!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Student Age: ");
                    int age = scanner.nextInt();

                    manager.addStudent(id, name, age);
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
