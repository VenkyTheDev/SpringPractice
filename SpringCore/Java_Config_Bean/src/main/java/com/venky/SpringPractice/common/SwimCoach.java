package com.venky.SpringPractice.common;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("In the Constructor: " + this.getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim for 30 minutes daily";
    }
}
