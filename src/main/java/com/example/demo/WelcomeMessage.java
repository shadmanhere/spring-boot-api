package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public void printWelcomeMessage() {
        System.out.println("Welcome to the Spring Boot Application");
    }
}
