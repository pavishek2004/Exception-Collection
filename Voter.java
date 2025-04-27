package exceptionCollection;

import java.util.Scanner;

public class Voter {
    private int voterId;
    private String name;
    private int age;
    
    // Parameterized constructor with age validation
    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("Invalid age for voter");
        }
        
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
    
    // Getters
    public int getVoterId() {
        return voterId;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Voter [ID: " + voterId + ", Name: " + name + ", Age: " + age + "]";
    }
    
    // Main method to test the Voter class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("--- Voter Registration System ---");
            
            System.out.print("Enter Voter ID: ");
            int voterId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            
            // Try to create a Voter object
            Voter voter = new Voter(voterId, name, age);
            System.out.println("\nVoter registered successfully!");
            System.out.println(voter);
            
        } catch (InvalidVoterAgeException e) {
            System.out.println("\nError: " + e.getMessage());
            System.out.println("Voter registration failed. Minimum age requirement is 18 years.");
        } catch (Exception e) {
            System.out.println("\nInvalid input. Please check your input format.");
        } finally {
            scanner.close();
        }
    }
}