/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.fitnesstracker;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class UserTest {
    
   

    /**
     * Test of logExercise method, of class User.
     */
    @Test
    public void testLogExercise() {
        System.out.println("logExercise");
        String exerciseName = "";
        int duration = 0;
        int caloriesBurned = 0;
        User instance = null;
        instance.logExercise(exerciseName, duration, caloriesBurned);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logDiet method, of class User.
     */
    @Test
    public void testLogDiet() {
        System.out.println("logDiet");
        String foodItem = "";
        int calories = 0;
        User instance = null;
        instance.logDiet(foodItem, calories);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReport method, of class User.
     */
    @Test
    public void testPrintReport() {
        System.out.println("printReport");
        User instance = null;
        instance.printReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
