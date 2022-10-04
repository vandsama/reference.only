package com.techelevator.farm.review;

import javax.swing.plaf.basic.BasicSliderUI;
import java.beans.beancontext.BeanContextServicesListener;

public class ElectricBill {

    private final double BASIC_SERVICE_RATE = 0.20;
    private final double BASIC_SERVICE_LIMIT = 0.50;
    private final double EXCESS_SERVICE_RATE = 0.30;
    private final double RENEWABLE_ENERGY_DISCOUNT = 0.10;

    public static void main(String[] args) {
        ElectricBill calculator = new ElectricBill();
        System.out.println(calculator.calculate(50,0));
        System.out.println(calculator.calculate(110,120));
    }

    public double calculate(double unitsUsed, double unitsReturned) {

        double billTotal = 0;
        final double netUsage = unitsUsed - unitsReturned;
//if netUsage is less than basic service limit, then charge normally.
        if (netUsage <= BASIC_SERVICE_LIMIT) {
            billTotal = netUsage * BASIC_SERVICE_RATE;
        } else { //otherwise, calculate the excess usage and add that to the total at the excess rate
            double excess = netUsage - BASIC_SERVICE_LIMIT;
            billTotal = BASIC_SERVICE_LIMIT * BASIC_SERVICE_RATE;
            billTotal += excess * EXCESS_SERVICE_RATE;
        }
//discount will only be applied if billTotal was not negative, and unitsReturned were positive
        if (billTotal > 0 && unitsReturned > 0) {
            billTotal *= (1-RENEWABLE_ENERGY_DISCOUNT);
        }
        return billTotal;

    }
}
