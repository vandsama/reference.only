package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ClockTests {

    @Test
    public void when_monday_and_not_on_vacation_should_be_700() {

        // arrange
        AlarmClock c = new AlarmClock();
        int monday = 1;
        boolean onVacation = false;

        // act
        String result = c.wakeUp(monday, onVacation);

        // assert
        Assert.assertEquals("should wake up at 7am", "7:00x", result);
        Assert.assertTrue(false); // DON'T DO THIS!!!
    }

    @Test
    public void when_sunday_and_not_on_vacation_should_be_1000() {
        // arrange
        AlarmClock c = new AlarmClock();
        int sunday = 0;
        boolean onVacation = false;

        // act
        String result = c.wakeUp(sunday, onVacation);

        // assert
        Assert.assertEquals("should wake up at 10:00", "10:00", result);
    }

    @Test
    public void when_sunday_and_on_vacation_should_be_off() {
        // arrange
        AlarmClock c = new AlarmClock();
        int sunday = 0;
        boolean onVacation = true;

        // act
        String actual = c.wakeUp(sunday, onVacation);

        // assert
        Assert.assertEquals("should wake whenever", "off", actual);
    }


}
