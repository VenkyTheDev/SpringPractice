package com.venky.SpringPractice.config;

import com.venky.SpringPractice.common.Coach;
import com.venky.SpringPractice.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic") //If the bean has the ID then the id is used for the @Qualifier("") term {Here aquatic is used}
    public Coach swimCoach(){//the name is according to the @Qualifier("swimCoach") in the DemoController
        return new SwimCoach();
    }
}
