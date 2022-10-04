package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTests {
    @Test public void StringBits_Hello_should_produce_Hlo() {
        StringBits stringBits = new StringBits();
        String str = "Hello";

        String result = stringBits.getBits(str);

        Assert.assertEquals("Hello should produce Hlo","Hlo",result);
    }

    @Test public void StringBits_Hi_should_produce_H() {
        StringBits stringBits = new StringBits();
        String str = "Hi";

        String result = stringBits.getBits(str);

        Assert.assertEquals("Hi should produce H","H",result);
    }

    @Test public void StringBits_Heeololeo_should_produce_Hello() {
        StringBits stringBits = new StringBits();
        String str = "Heeololeo";

        String result = stringBits.getBits(str);

        Assert.assertEquals("Heeololeo should produce Hlo","Hello",result);
    }
}
