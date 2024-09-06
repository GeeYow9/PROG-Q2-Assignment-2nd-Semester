
package com.mycompany.fitnesstracker;

public class User {
    private String name;
    private int targetWeight; // weight to achieve
    private Exercise[] exercises;
    private Diet[] diets;
    private int exerciseCount;
    private int dietCount;

    public User(String name, int targetWeight, int maxExercises, int maxDiets) {
        this.name = name;
        this.targetWeight = targetWeight;
        this.exercises = new Exercise[maxExercises];
        this.diets = new Diet[maxDiets];
        this.exerciseCount = 0;
        this.dietCount = 0;
    }

    public void logExercise(String exerciseName, int duration, int caloriesBurned) {
        if (exerciseCount < exercises.length) {
            exercises[exerciseCount++] = new Exercise(exerciseName, duration, caloriesBurned);
        }
    }

    public void logDiet(String foodItem, int calories) {
        if (dietCount < diets.length) {
            diets[dietCount++] = new Diet(foodItem, calories);
        }
    }

    public void printReport() {
        System.out.println("Fitness Report for " + name);
        System.out.println("Target Weight: " + targetWeight + " kg");

        System.out.println("\nExercises Log:");
        for (int i = 0; i < exerciseCount; i++) {
            System.out.println("- " + exercises[i].getName() + ": " + exercises[i].getDuration() + " mins, " + exercises[i].getCaloriesBurned() + " calories burned.");
        }

        System.out.println("\nDiets Log:");
        int totalCalories = 0;
        for (int i = 0; i < dietCount; i++) {
            System.out.println("- " + diets[i].getFoodItem() + ": " + diets[i].getCalories() + " calories.");
            totalCalories += diets[i].getCalories();
        }

        System.out.println("\nTotal Calories Consumed: " + totalCalories);
        System.out.println("Net Calories Burned: " + calculateNetCalories());
    }

    private int calculateNetCalories() {
        int totalBurned = 0;
        for (int i = 0; i < exerciseCount; i++) {
            totalBurned += exercises[i].getCaloriesBurned();
        }
        return totalBurned - getTotalDietCalories();
    }

    private int getTotalDietCalories() {
        int totalCalories = 0;
        for (int i = 0; i < dietCount; i++) {
            totalCalories += diets[i].getCalories();
        }
        return totalCalories;
    }
}