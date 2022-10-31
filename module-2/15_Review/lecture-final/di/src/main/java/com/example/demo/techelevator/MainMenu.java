package com.example.demo.techelevator;

import org.springframework.stereotype.Component;

@Component
public class MainMenu {

    Inventory inventory;

    public MainMenu(Inventory inventory) {
        this.inventory = inventory;
        System.out.println("Hello from MainMenu");
//        File inventoryFile = new File("the-file.csv");
//        inventory = new Inventory();
//        inventory.loadFrom(inventoryFile);
    }
}
