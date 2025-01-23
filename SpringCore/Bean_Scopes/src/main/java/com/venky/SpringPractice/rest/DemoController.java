package com.venky.SpringPractice.rest;

import com.venky.SpringPractice.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach , @Qualifier("cricketCoach") Coach anotherCoach) {
        this.coach = coach;
        this.anotherCoach= anotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String dailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing coach and another coach.....  Result: " + (coach.equals(anotherCoach));
    }
}
