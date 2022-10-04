package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests {

    @Test public void either_you_or_date_is_unstylish_should_produce_no_and_you_are_unstylish() {
        //arrange
        DateFashion dateFashion = new DateFashion();
        int you = 0;
        int date = 9;

        //act
        int result = dateFashion.getATable(you,date);

        //assert
        Assert.assertEquals("result should be no if either you or date is unstylish", 0,result);

    }
    @Test public void either_you_or_date_is_unstylish_should_produce_no_and_your_date_is_unstylish() {
        //arrange
        DateFashion dateFashion = new DateFashion();
        int you = 9;
        int date = 0;

        //act
        int result = dateFashion.getATable(you,date);

        //assert
        Assert.assertEquals("result should be no if either you or date is unstylish", 0,result);

    }

    @Test public void either_you_or_date_is_stylish_and_the_other_is_regular_stylishness_should_produce_yes_and_you_are_stylish() {
        //arrange
        DateFashion dateFashion = new DateFashion();
        int you = 9;
        int date = 3;

        //act
        int result = dateFashion.getATable(you,date);

        //assert
        Assert.assertEquals("result should be yes if either you or date is stylish, and the other is regular " +
                        "stylishness", 2,
                result);
    }

    @Test public void either_you_or_date_is_stylish_and_the_other_is_regular_stylishness_should_produce_yes_and_your_date_is_stylish() {
        //arrange
        DateFashion dateFashion = new DateFashion();
        int you = 3;
        int date = 9;

        //act
        int result = dateFashion.getATable(you,date);

        //assert
        Assert.assertEquals("result should be yes if either you or date is stylish, and the other is regular " +
                        "stylishness", 2,
                result);
    }

    @Test public void you_and_your_date_are_both_regular_stylishness_should_produce_maybe_testing_lower_bound() {
        //arrange
        DateFashion dateFashion = new DateFashion();
        int you = 3;
        int date = 3;

        //act
        int result = dateFashion.getATable(you,date);

        //assert
        Assert.assertEquals("result should be maybe if both you and your date are regular stylishness", 1,
                result);
    }
    @Test public void you_and_your_date_are_both_regular_stylishness_should_produce_maybe_testing_upper_bound() {
        //arrange
        DateFashion dateFashion = new DateFashion();
        int you = 7;
        int date = 7;

        //act
        int result = dateFashion.getATable(you,date);

        //assert
        Assert.assertEquals("result should be maybe if both you and your date are regular stylishness", 1,
                result);
    }

}
