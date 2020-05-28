package com.springframework.blondeforactuator.config;

import com.springframework.blondeforactuator.service.ListOfJokes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BlondeConfiguration {

    @Bean
    public ListOfJokes listOfJokes(){
        return new ListOfJokes();
    }
}
