
package com.mycompany.fitnesstracker;
public class Diet {
    private String foodItem;
    private int calories;

    public Diet(String foodItem, int calories) {
        this.foodItem = foodItem;
        this.calories = calories;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    
}