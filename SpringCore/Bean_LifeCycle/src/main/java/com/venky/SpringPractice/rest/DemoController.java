package com.venky.SpringPractice.rest;

import com.venky.SpringPractice.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach) {
        System.out.println("In Coach Constructor: " + getClass().getName());
        this.coach = coach;
    }

    @PostConstruct
    public void init(){
        System.out.println("In PostConstruct: " + getClass().getName());
    }

    @PreDestroy
    public void destroy(){
        System.out.println("In PreDestroy: " + getClass().getName());
    }

    @GetMapping("/dailyworkout")
    public String dailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/")
    public String test(){
        return "Hello World";
    }

}
