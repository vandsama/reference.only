package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests {

    @Test public void less20_18_should_test_true() {
        // arrange
        Less20 less20 = new Less20();
        int n = 18;

        // act
        boolean result = less20.isLessThanMultipleOf20(n);

        // assert
        Assert.assertTrue("18 should produce true",result);
    }

    @Test public void less20_19_should_test_true() {
        // arrange
        Less20 less20 = new Less20();
        int n = 19;

        // act
        boolean result = less20.isLessThanMultipleOf20(n);

        // assert
        Assert.assertTrue("19 should produce true",result);
    }

    @Test public void less20_20_should_test_false() {
        // arrange
        Less20 less20 = new Less20();
        int n = 20;

        // act
        boolean result = less20.isLessThanMultipleOf20(n);

        // assert
        Assert.assertFalse("20 should produce false",result);
    }

}
