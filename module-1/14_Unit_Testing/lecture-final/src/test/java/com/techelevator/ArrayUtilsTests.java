package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsTests {

    @Test
    public void when_given_an_array_move_first_element() {
        // arrange
        ArrayUtils au = new ArrayUtils();
        int[] input = {1,2,3};

        // act
        int[] actual = au.rotateLeft3(input);

        // assert
        int[] expected = {2,3,1};
        Assert.assertArrayEquals("first element should move to the end", expected, actual);


    }
}
