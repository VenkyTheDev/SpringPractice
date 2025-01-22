package com.venky.springBoot.FirstApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String teamInfo() {
        return "Coach name: " +  coachName + " " + "Team name: " +  teamName;
    }

    @GetMapping("/")
    public String sayHelloWorld(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Working Out";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Trust God and everything will follow";
    }
}
