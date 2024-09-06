
package com.mycompany.fitnesstracker;

import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your target weight (kg): ");
        int targetWeight = scanner.nextInt();
        
        User user = new User(name, targetWeight, 100, 100);
        
        boolean running = true;
        while (running) {
            System.out.println("\n1. Enter Exercise");
            System.out.println("2. Enter Diet");
            System.out.println("3. Print Report");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter exercise name: ");
                    scanner.nextLine(); // clear buffer
                    String exerciseName = scanner.nextLine();
                    System.out.print("Enter duration (mins): ");
                    int duration = scanner.nextInt();
                    System.out.print("Enter calories burned: ");
                    int caloriesBurned = scanner.nextInt();
                    user.logExercise(exerciseName, duration, caloriesBurned);
                    break;
                    
                case 2:
                    System.out.print("Enter food item: ");
                    scanner.nextLine(); // clear buffer
                    String foodItem = scanner.nextLine();
                    System.out.print("Enter calories: ");
                    int calories = scanner.nextInt();
                    user.logDiet(foodItem, calories);
                    break;
                    
                case 3:
                    user.printReport();
                    break;
                    
                case 4:
                    running = false;
                    break;
                    
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        
        scanner.close();
        System.out.println("Thank you for using the Fitness Tracker!");
    }
}
