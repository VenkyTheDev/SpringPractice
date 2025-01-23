package com.venky.SpringPractice.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach {
    public BaseballCoach() {
        System.out.println("In the Constructor: " + this.getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swing the bat with full strength";
    }
}
