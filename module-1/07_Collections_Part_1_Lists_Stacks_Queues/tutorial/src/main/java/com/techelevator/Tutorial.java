package com.techelevator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Tutorial {
	
    public static void main(String[] args) {

    	// Step One: Declare a List
        List<String> listName = new ArrayList<>();

    	// Step Two: Add values to a List
        listName.add(0,"A String");
        listName.add(1,"Another String");
        listName.add(2,"More String");

    	// Step Three: Looping through a List in a for loop
        for (int i = 0; i < listName.size(); i++) {
            System.out.println(listName.get(i));
            System.out.println(listName.indexOf(listName.get(i)));
        }
    	
    	// Step Four: Remove an item
        System.out.println("\n");

        listName.remove("A String");
        listName.set(0,"New A String New!");

        for (int i = 0; i < listName.size(); i++) {
            System.out.println(listName.get(i));
            System.out.println(listName.indexOf(listName.get(i)));
        }
    	
    	// Step Five: Looping through List in a for-each loop
        System.out.println("\n");
        for (String thingie : listName) {
            System.out.println(thingie + " Index: " + listName.indexOf(thingie));
        }


        System.out.println("\n" + listName);
    }

}
