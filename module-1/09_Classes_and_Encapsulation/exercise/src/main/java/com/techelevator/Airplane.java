package com.techelevator;

public class Airplane {
    String planeNumber;
    int totalFirstClassSeats;
    int bookedFirstClassSeats;
    int totalCoachSeats;
    int bookedCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats - bookedFirstClassSeats;
    }

    public int getAvailableCoachSeats() {
        return totalCoachSeats - bookedCoachSeats;
    }

    public boolean reserveSeats (boolean forFirstClass, int totalNumberOfSeats){
        if (totalNumberOfSeats < getAvailableCoachSeats() && forFirstClass == false) {
            bookedCoachSeats += totalNumberOfSeats;
            return true;
        } else if (totalNumberOfSeats < getAvailableFirstClassSeats() && forFirstClass == true) {
            bookedFirstClassSeats += totalNumberOfSeats;
            return true;
        } else {
            return false;
        }
    }

}
