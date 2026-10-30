package com.hello.controller;

import com.hello.service.GreetingFormatter;
import com.hello.service.GreetingService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class GreetingController implements Controller {

    private final GreetingService greetingService;
    private final GreetingFormatter greetingFormatter;

    public GreetingController(GreetingService greetingService, GreetingFormatter greetingFormatter) {
        this.greetingService = greetingService;
        this.greetingFormatter = greetingFormatter;
    }

    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String greeting = greetingService.getGreeting();
        String format = greetingFormatter.format(greeting);

        ModelAndView modelAndView = new ModelAndView("greeting");

        return modelAndView.addObject("message",format);
    }
}
