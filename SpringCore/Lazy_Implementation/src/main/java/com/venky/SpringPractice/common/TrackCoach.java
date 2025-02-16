package com.venky.SpringPractice.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    public TrackCoach() {
        System.out.println("In the Constructor: " + this.getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run 5k meters everyDay";
    }
}
