package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTests {

    @Test public void Chocolate_2_Returns_ChoCho() {
        // arrange
        FrontTimes frontTimes = new FrontTimes();
        String str = "Chocolate";
        int n = 2;

        // act
        String result = frontTimes.generateString(str,n);

        // assert
        Assert.assertEquals("result should be ChoCho if n=2","ChoCho", result);
    }

    @Test public void Chocolate_3_Returns_ChoChoCho() {
        // arrange
        FrontTimes frontTimes = new FrontTimes();
        String str = "Chocolate";
        int n = 3;

        // act
        String result = frontTimes.generateString(str,n);

        // assert
        Assert.assertEquals("result should be ChoChoCho if n=3","ChoChoCho", result);
    }

    @Test public void Abc_3_Returns_AbcAbcAbc() {
        // arrange
        FrontTimes frontTimes = new FrontTimes();
        String str = "Abc";
        int n = 3;

        // act
        String result = frontTimes.generateString(str,n);

        // assert
        Assert.assertEquals("result should be AbcAbcAbc if n=3","AbcAbcAbc", result);
    }
}
