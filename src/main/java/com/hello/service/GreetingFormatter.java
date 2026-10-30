package com.hello.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GreetingFormatter {
    private String prefix;

    public String format(String message){
        return prefix + message;
    }
}
