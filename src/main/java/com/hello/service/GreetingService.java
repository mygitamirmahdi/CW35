package com.hello.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GreetingService {
    private static final List<String> greeting = new ArrayList<>(List.of(("Hello!"),
            ("Salam!"),
            ("Sagol"))
    );
    private Random random = new Random();


    public String getGreeting(){
        int randomIndex = random.nextInt(greeting.size());
        return greeting.get(randomIndex);
    }
}
