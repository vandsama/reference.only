package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class AnimalGroupNameTests {

    @Test
    public void correct_animal_group_name_for_animal_test() {
        // arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String giraffe = "giraffe";

        // act
        String result = animalGroupName.getHerd(giraffe);

        // assert
        Assert.assertEquals("giraffe should return Tower","Tower", result);
    }


    @Test
    public void returns_unknown_if_animal_is_null() {
        // arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String nullName = null;

        // act
        String result = animalGroupName.getHerd(nullName);

        // assert
        Assert.assertEquals("null animal should return unknown","unknown", result);
    }


    @Test
    public void returns_unknown_if_animal_not_on_list() {
        // arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String unknownName = "";

        // act
        String result = animalGroupName.getHerd(unknownName);

        // assert
        Assert.assertEquals("unknown animal should return unknown","unknown", result);
    }



}
