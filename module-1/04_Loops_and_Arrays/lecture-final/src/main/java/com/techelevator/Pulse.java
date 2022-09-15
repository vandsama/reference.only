package com.techelevator;

public class Pulse {
    public static void main(String[] args) {
        int x = 0;
        x = x + 1;
        x += 1;
        x++;
        x--;
        x -= 2;
        x = x - 2;
        x *= 3;
        x = x * 3;
        x /= 2;
        x = x / 2;


         /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train
	    has already travelled 537 miles. What percentage of the trip as a whole number has been completed?
	    */
        int totalDistance = 800;
        int alreadytravelled = 537;
        double portionComplete = alreadytravelled * 1.0 / totalDistance;
        int completedPercentage = (int)(portionComplete * 100);
        System.out.println(completedPercentage);

    }
}
