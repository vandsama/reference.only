package com.techelevator;

public class Elevator {
    int currentFloor = 1;
    int numberOfFloors;
    boolean doorOpen;


    public Elevator(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }


    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }


    public void openDoor() {
        doorOpen = true;
    }

    public void closeDoor() {
        doorOpen = false;
    }

    public void goUp(int desiredFloor) {
        if (!doorOpen && currentFloor<numberOfFloors) {
            currentFloor += 1;
        }
    }

    public void goDown(int desiredFloor) {
        if (!doorOpen && currentFloor>1){
            currentFloor -= 1;
        }
    }


}
