package exceptionCollection;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueInput = 'y';
        
        while (Character.toLowerCase(continueInput) == 'y') {
            try {
                // Get student details from user
                System.out.println("\n--- Enter Student Details ---");
                
                System.out.print("Enter Roll Number: ");
                int rollNo = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                System.out.print("Enter Name (alphabets only): ");
                String name = scanner.nextLine();
                
                System.out.print("Enter Age (15-21): ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                System.out.print("Enter Course: ");
                String course = scanner.nextLine();
                
                // Create student object with user input
                Student student = new Student(rollNo, name, age, course);
                System.out.println("\nStudent created successfully: " + student);
                
            } catch (AgeNotWithinRangeException e) {
                System.out.println("\nError: " + e.getMessage());
                
            } catch (NameNotValidException e) {
                System.out.println("\nError: " + e.getMessage());
                
            } catch (Exception e) {
                System.out.println("\nInvalid input. Please check your input format.");
                scanner.nextLine(); // Clear input buffer in case of error
            }
            
            // Ask if user wants to input another student
            System.out.print("\nDo you want to enter another student? (y/n): ");
            continueInput = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline
        }
        
        System.out.println("\nThank you for using the Student Management System!");
        scanner.close();
    }
}