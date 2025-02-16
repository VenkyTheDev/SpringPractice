package com.venky.SpringPractice.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In the Constructor: " + this.getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Bowling Like Siraj(D.S.P)";
    }
}
