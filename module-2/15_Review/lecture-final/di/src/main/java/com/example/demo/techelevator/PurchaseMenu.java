package com.example.demo.techelevator;

import org.springframework.stereotype.Component;

@Component
public class PurchaseMenu {

    Inventory inventory;

    public PurchaseMenu(Inventory inventory) {
        System.out.println("hello from PurchaseMenu");
//        File inventoryFile = new File("inventory.csv");
//        this.inventory = new Inventory();
//        this.inventory.loadFrom(inventoryFile);

    }
}
