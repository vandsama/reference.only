package com.example.demo;

import com.example.demo.techelevator.MainMenu;
import com.example.demo.techelevator.PurchaseMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public DemoApplication(MainMenu mainMenu, PurchaseMenu purchaseMenu) {
		System.out.println("hello from demo");
//		File file = new File("inventory.csv");
//		Inventory inventory = new Inventory();
//		inventory.loadFrom(file);

//		MainMenu mainMenu = new MainMenu(inventory);
//		PurchaseMenu purchaseMenu = new PurchaseMenu(inventory);

	}
}
