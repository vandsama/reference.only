package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Tests {

    @Test public void MaxEnd3_123_should_produce_333() {
        // arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();
        int[] nums = new int[] {1,2,3};

        // act
        int[] result = maxEnd3.makeArray(nums);

        // assert
        Assert.assertArrayEquals("[1,2,3] should produce [3,3,3]", new int[]{3, 3, 3},result);
    }

    @Test public void MaxEnd3_1159_should_produce_111111() {
        // arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();
        int[] nums = new int[] {11,5,9};

        // act
        int[] result = maxEnd3.makeArray(nums);

        // assert
        Assert.assertArrayEquals("[11,5,9] should produce [11,11,11]", new int[]{11,11,11},result);
    }

    @Test public void MaxEnd3_2113_should_produce_333() {
        // arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();
        int[] nums = new int[] {2,11,3};

        // act
        int[] result = maxEnd3.makeArray(nums);

        // assert
        Assert.assertArrayEquals("[2,11,3] should produce [3,3,3]", new int[]{3, 3, 3},result);
    }
}
