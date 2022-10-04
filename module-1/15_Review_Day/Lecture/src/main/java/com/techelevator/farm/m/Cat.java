package com.techelevator.farm.m;

public class Cat extends FarmAnimal implements HasCustomSound {
    public Cat() {
        super("cat", "meow");
    }

    @Override
    public String eat() {
        return "mice";
    }

    @Override
    public String getCustomSound() {
        if (Math.random() > 0.5) {
            return "purrrrrr";
        } else {
            return "meow";
        }
    }
}
