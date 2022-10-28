package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println(message);
    }
}
