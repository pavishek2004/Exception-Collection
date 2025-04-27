package exceptionCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeManager {
    // HashMap to store student names and grades
    private Map<String, Integer> studentGrades;
    
    // Constructor
    public StudentGradeManager() {
        studentGrades = new HashMap<>();
    }
    
    // Method to add a new student and grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student '" + name + "' added with grade: " + grade);
    }
    
    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student '" + name + "' has been removed.");
        } else {
            System.out.println("Student '" + name + "' not found in the system.");
        }
    }
    
    // Method to display a student's grade
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println("Grade for student '" + name + "': " + grade);
        } else {
            System.out.println("Student '" + name + "' not found in the system.");
        }
    }
    
    // Method to display all students and grades
    public void displayAllGrades() {
        if (studentGrades.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        
        System.out.println("\nAll Student Grades:");
        System.out.println("------------------");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        StudentGradeManager manager = new StudentGradeManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        // Add some sample data
        manager.addStudent("John", 85);
        manager.addStudent("Alice", 92);
        manager.addStudent("Bob", 78);
        
        while (running) {
            System.out.println("\nStudent Grade Management System");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Display a student's grade");
            System.out.println("4. Display all grades");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter grade: ");
                        int grade = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        manager.addStudent(name, grade);
                        break;
                        
                    case 2:
                        System.out.print("Enter student name to remove: ");
                        name = scanner.nextLine();
                        manager.removeStudent(name);
                        break;
                        
                    case 3:
                        System.out.print("Enter student name to display grade: ");
                        name = scanner.nextLine();
                        manager.displayGrade(name);
                        break;
                        
                    case 4:
                        manager.displayAllGrades();
                        break;
                        
                    case 5:
                        running = false;
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                        
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
                
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine(); // Clear the scanner buffer
            }
        }
        
        scanner.close();
    }
}