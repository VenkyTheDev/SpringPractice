package com.venky.SpringPractice.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Try to ace every shot";
    }
}
