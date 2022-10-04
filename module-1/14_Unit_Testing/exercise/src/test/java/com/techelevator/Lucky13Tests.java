package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests {

    @Test
    public void Lucky13_024_should_produce_true() {
        // arrange
        Lucky13 lucky13 = new Lucky13();
        int[] nums = new int[] {0,2,4};

        // act
        boolean result = lucky13.getLucky(nums);

        // assert
        Assert.assertTrue("[0, 2, 4] should produce true",result);
    }

    @Test
    public void Lucky13_123_should_produce_false() {
        // arrange
        Lucky13 lucky13 = new Lucky13();
        int[] nums = new int[] {1,2,3};

        // act
        boolean result = lucky13.getLucky(nums);

        // assert
        Assert.assertFalse("[1, 2, 3] should produce false",result);
    }

    @Test
    public void Lucky13_124_should_produce_false() {
        // arrange
        Lucky13 lucky13 = new Lucky13();
        int[] nums = new int[] {1,2,4};

        // act
        boolean result = lucky13.getLucky(nums);

        // assert
        Assert.assertFalse("[1, 2, 4] should produce false",result);
    }

}
