package com.example.demo.techelevator;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class Inventory {

    public Inventory() {
        System.out.println("hello from Inventory");
    }

    public void loadFrom(File file) {

    }
}
