package com.springframework.blondeforactuator.config;

import com.springframework.blondeforactuator.service.ListOfJokes;

//@Configuration
public class BlondeConfiguration {

//    @Bean
    public ListOfJokes listOfJokes(){
        return new ListOfJokes();
    }
}
