package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;

public class AlarmClockTests {

    @Test
    public void when_monday_and_not_on_vacation() {
        // arrange
        final AlarmClock clock = new AlarmClock();
        final int monday = 1;

        // act
        String result = clock.clockAlarm(monday, false);

        // assert
        Assert.assertEquals("should be 7am","7:00", result);
    }

    @Test
    public void when_friday_and_not_on_vacation() {
        // arrange
        final AlarmClock clock = new AlarmClock();
        final int friday = 5;

        // act
        String result = clock.clockAlarm(friday, false);

        // assert
        Assert.assertEquals("should be 7am","7:00", result);
    }

    @Test
    public void when_weekend_and_not_on_vacation() {
        // arrange
        final AlarmClock clock = new AlarmClock();
        final int saturday = 6;

        // act
        String result = clock.clockAlarm(saturday, false);

        //assert
        Assert.assertEquals("should be 10:00", "10:00", result);
    }

    @Test()
    public void when_weekday_and_on_vacation() {
        final int wednesday= 3;
        baseTest(wednesday, true, "10:00");
    }

    @Test
    public void when_weekend_and_on_vacation() {
        final int saturday = 6;
        baseTest(saturday, true, "off");
    }

    @Test
    public void when_sunday_and_on_vacation() {
        final int sunday = 0;
        baseTest(sunday, true, "off");
    }

    private void baseTest(int dayOfWeek, boolean onVacation, String expected) {
        // arrange
        final AlarmClock clock = new AlarmClock();

        // act
        String result = clock.clockAlarm(dayOfWeek, onVacation);

        //assert
        Assert.assertEquals("should be: " + expected, expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_not_a_valid_day_throw_exception() {
        baseTest(9, true, "off");
    }

}
