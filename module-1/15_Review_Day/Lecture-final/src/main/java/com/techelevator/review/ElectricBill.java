package com.techelevator.review;

public class ElectricBill {

    private final double BASIC_SERVICE_RATE = 0.20;
    private final double BASIC_SERVICE_LIMIT = 100.0;
    private final double EXCESS_SERVICE_RATE = 0.25;
    private final double RENEWABLE_ENERGY_DISCOUNT = 0.05;

    public static void main(String[] args) {
        ElectricBill calculator = new ElectricBill();
        System.out.println(calculator.calculate(50,0));
        System.out.println(calculator.calculate(110,120));
    }

     /*
    Tech Electric now allows customers with renewable energy to return electricity back into the grid,
    and has accordingly adjusted the rules around the renewable energy discount.

    The difference between the units used by the customer and the units returned by them is the net usage.

    Using Tech Electric's simple pricing model, calculate a customer's bill based upon their net usage.

    Apply the renewable energy discount. Customers with a "credit" bill (a negative bill amount), or who
    have not contributed back to the grid (zero returned units) are not eligible for the renewable energy
    discount.

    Implement the logic to calculate a customer's bill when provided with the number of units used and
    units returned.

    Examples:
    calculateElectricBill(50, 0) ➔ 10.0
    calculateElectricBill(50, 4) ➔ 8.74
    calculateElectricBill(50, 60) ➔ -2.0
    calculateElectricBill(110, 6) ➔ 19.95
    calculateElectricBill(110, 20) ➔ 17.1
    calculateElectricBill(110, 120) ➔ -2.0
     */

    public double calculate(double unitsUsed, double unitsReturned) {

        double billTotal = 0;
        final double netUsage = unitsUsed - unitsReturned;

        // calculate base bill amount
        if (netUsage <= BASIC_SERVICE_LIMIT) {
            billTotal = netUsage * BASIC_SERVICE_RATE;
        } else {
            double excess = netUsage - BASIC_SERVICE_LIMIT;
            billTotal = BASIC_SERVICE_LIMIT * BASIC_SERVICE_RATE;
            billTotal += excess * EXCESS_SERVICE_RATE;
        }

        // apply discount if appropriate
        if (billTotal > 0 && unitsReturned > 0) {
            billTotal *= (1-RENEWABLE_ENERGY_DISCOUNT);
        }

        return billTotal;
    }

}
