package exceptionCollection;

import java.util.Stack;
import java.util.Scanner;

public class IntegerStackOperations {
    // Stack to store integers
    private Stack<Integer> stack;
    
    // Constructor
    public IntegerStackOperations() {
        stack = new Stack<>();
    }
    
    // Function to push an element onto the stack
    public void push(int element) {
        stack.push(element);
        System.out.println(element + " pushed onto the stack");
    }
    
    // Function to pop an element from the stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
        } else {
            int element = stack.pop();
            System.out.println(element + " popped from the stack");
        }
    }
    
    // Function to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    // Function to display the current state of the stack
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Current stack elements (top to bottom): " + stack);
        }
    }
    
    public static void main(String[] args) {
        IntegerStackOperations stackOps = new IntegerStackOperations();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("Integer Stack Operations");
        System.out.println("=======================");
        
        while (running) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Check if stack is empty");
            System.out.println("4. Display stack");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice (1-5): ");
            
            try {
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter an integer to push: ");
                        int element = scanner.nextInt();
                        stackOps.push(element);
                        break;
                        
                    case 2:
                        stackOps.pop();
                        break;
                        
                    case 3:
                        if (stackOps.isEmpty()) {
                            System.out.println("The stack is empty.");
                        } else {
                            System.out.println("The stack is not empty.");
                        }
                        break;
                        
                    case 4:
                        stackOps.displayStack();
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