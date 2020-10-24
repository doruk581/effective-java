package com.doruk.tutorials.construction.builder;

public class Main {

    public static void main(String[] args) {
        NutritionFact nutritionFact = new NutritionFact.Builder(340,8).calories(1).sodium(2).build();
    }
}
