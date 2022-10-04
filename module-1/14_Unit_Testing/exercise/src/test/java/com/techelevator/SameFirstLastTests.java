package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTests {
    @Test public void SameFirstLast_123_should_produce_false(){
        //arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] nums = new int[] {1,2,3};

        //act
        boolean result = sameFirstLast.isItTheSame(nums);

        //assert
        Assert.assertFalse("[1,2,3] should produce false",result);
    }

    @Test public void SameFirstLast_1231_should_produce_true(){
        //arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] nums = new int[] {1,2,3,1};

        //act
        boolean result = sameFirstLast.isItTheSame(nums);

        //assert
        Assert.assertTrue("[1,2,3,1] should produce true",result);
    }

    @Test public void SameFirstLast_121_should_produce_true(){
        //arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] nums = new int[] {1,2,1};

        //act
        boolean result = sameFirstLast.isItTheSame(nums);

        //assert
        Assert.assertTrue("[1,2,1] should produce true",result);
    }
}
