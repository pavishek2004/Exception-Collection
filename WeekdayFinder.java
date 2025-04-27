package exceptionCollection;

import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        // Store weekday names in an array (Sunday at index 0)
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Weekday Finder Program");
            System.out.println("----------------------");
            System.out.println("Enter a number between 0-6 to get the corresponding day:");
            System.out.print("Day position: ");
            
            int position = scanner.nextInt();
            
            // Try to access the array element
            String dayName = weekdays[position];
            System.out.println("The day at position " + position + " is: " + dayName);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid day position entered!");
            System.out.println("Please enter a number between 0 and 6 only.");
            System.out.println("0 = Sunday, 1 = Monday, ..., 6 = Saturday");
        } catch (Exception e) {
            System.out.println("Error: Invalid input! Please enter a number.");
        } finally {
            scanner.close();
        }
    }
}
