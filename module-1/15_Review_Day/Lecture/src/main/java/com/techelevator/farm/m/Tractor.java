package com.techelevator.farm.m;

public class Tractor implements Singable {

    private String name;
    private String sound;

    public Tractor() {
        name = "Tractor";
        sound = "vroom!";
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }
}
