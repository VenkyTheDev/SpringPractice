package com.venky.SpringPractice.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("In the Constructor: " + this.getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Try to ace every shot";
    }
}
