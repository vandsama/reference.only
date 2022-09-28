package com.techelevator.farm;

public class Cat extends FarmAnimal {
    public Cat() {
        super("cat", "meow");
    }

    @Override
    public String eat() {
        return "mice";
    }

//    @Override
//    public String getSound() {
//        if (Math.random() > 0.5) {
//            return "purrrrr";
//        } else {
//            return "meow";
//        }
//    }
}
