package com.example.demo;

import org.springframework.stereotype.Component;


public class ApiLogger implements Logger{
    @Override
    public void log(String message) {
        // calls an API
    }
}
