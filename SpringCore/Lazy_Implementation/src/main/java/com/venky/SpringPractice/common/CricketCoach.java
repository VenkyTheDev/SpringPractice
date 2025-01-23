package com.venky.SpringPractice.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In the Constructor: " + this.getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Bowling Like Siraj(D.S.P)";
    }
}
