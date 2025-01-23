package com.venky.SpringPractice.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swing the bat with full strength";
    }
}
