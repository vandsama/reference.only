package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Tutorial {
	

    public static void main(String[] args) {

        // Step One: Declare a Map
        Map<String, String> mapName = new HashMap<>();
    	
    	// Step Two: Add items to a Map
        mapName.put("Cincinnati", "Ohio");
        mapName.put("Columbus", "Ohio");
        mapName.put("Newport", "Menthols!");

       // System.out.println(mapName);

    	// Step Three: Loop through a Map
        for (Map.Entry<String, String> thing : mapName.entrySet()) {
            String key = thing.getKey();
            String value = thing.getValue();
            System.out.println(key + " " + value);
        }

        // Step Four
        mapName.remove("Cincinnati");
        System.out.println("\n");
        for (Map.Entry<String, String> thing : mapName.entrySet()) {
            String key = thing.getKey();
            String value = thing.getValue();
            System.out.println(key + " " + value);
        }

        for (Map.Entry<String, String> thingie : mapName.entrySet()) {
            String key = thingie.getKey();
            String value = thingie.getValue();
            System.out.println(key + " " + value);
        }
    }

}
