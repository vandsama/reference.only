package com.techelevator.farm;

public class Cat extends FarmAnimal {
    public Cat() {
        super("cat", "meow");
    }

    @Override
    public String eat() {
        return "mice";
    }


    @Override
    protected String GetCustomSound() {
        if (Math.random() > 0.5) {
            return "purrrrrr";
        } else {
            return "meow";
        }
    }

}
