package com.springframework.blondeforactuator.service;

import org.springframework.stereotype.Service;

@Service
public class BlondeQuotImpl implements BlondeQuot{

    private final ListOfJokes listOfJokes;

    public BlondeQuotImpl(ListOfJokes listOfJokes) {
        this.listOfJokes = listOfJokes;
    }

    @Override
    public String getRandomQuote() {
        return listOfJokes.getRandomQuote();
    }
}
