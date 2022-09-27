package com.techelevator.vee;

import com.techelevator.vee.model.Expense;
import com.techelevator.vee.model.Lodging;
import com.techelevator.vee.model.TravelDates;
import com.techelevator.vee.model.TravelGroup;
import com.techelevator.vee.model.transportation.CarTransportation;
import com.techelevator.vee.model.transportation.TicketedTransportation;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {


        CarTransportation myCar = new CarTransportation();
        TicketedTransportation myPlaneTicket = new TicketedTransportation(new TravelDates(), new TravelGroup());
        Lodging myLodging = new Lodging(new TravelDates());

        Expense myExpense = new CarTransportation();

        myExpense = myPlaneTicket;

        myCar.getTotalCost();
        myExpense.getTotalCost();

        myCar.setMpgEstimate(40.0);
        //myExpense.setMpgEstimate(40.0);


        List<Integer> myList = new ArrayList<>();

        myList.add(myCar);
        myList.add(myPlaneTicket);
        myList.add(myList);

        for (Expense expense : myList) {
            System.out.println(expense.getTotalCost());
        }
    }

}
