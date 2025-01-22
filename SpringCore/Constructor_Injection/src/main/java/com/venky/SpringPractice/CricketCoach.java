package com.venky.SpringPractice;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice Bowling Like Bhuvi";
    }
}
