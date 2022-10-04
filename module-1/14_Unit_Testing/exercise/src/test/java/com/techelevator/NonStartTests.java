package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests {
    @Test public void NonStart_Hello_There_should_produce_ellohere() {
        //arrange
        NonStart nonStart = new NonStart();
        String a = "Hello";
        String b = "There";

        //act
        String result = nonStart.getPartialString(a,b);

        //assert
        Assert.assertEquals("Hello There should produce ellohere", "ellohere",result);
    }

    @Test public void NonStart_java_code_should_produce_avaode() {
        //arrange
        NonStart nonStart = new NonStart();
        String a = "java";
        String b = "code";

        //act
        String result = nonStart.getPartialString(a,b);

        //assert
        Assert.assertEquals("java code should produce avaode", "avaode",result);
    }

    @Test public void NonStart_shotl_java_should_produce_hotlava() {
        //arrange
        NonStart nonStart = new NonStart();
        String a = "shotl";
        String b = "java";

        //act
        String result = nonStart.getPartialString(a,b);

        //assert
        Assert.assertEquals("shotl java should produce hotlava", "hotlava",result);
    }
}
