package com.techelevator;

public class Temperature {
    /*    GaleForce also needs to determine the hottest day when given an upcoming forecast.
          Given an array of high temperatures, determine the hottest day.
          Note: The array of high temperatures is guaranteed to have at least one
          element.

    Examples:
	hottestDay([81, 93, 94, 105, 99, 95, 101, 90, 89, 92]) → 105
	hottestDay([23, 24] → 24
	hottestDay([34, 33] → 34
	hottestDay([55]) → 55
	*/
    public int hottestDay(int[] dailyHighs) {
        int highestTemperature = 0;
        for (int i = 0; i < dailyHighs.length; i++) {
            if (dailyHighs[i] > highestTemperature) {
                highestTemperature = dailyHighs[i];
            }
        }
        return highestTemperature;
    }

}
