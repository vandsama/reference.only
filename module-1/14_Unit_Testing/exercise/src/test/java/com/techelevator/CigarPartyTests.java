package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests {

    @Test
    public void party_is_successful_if_cigars_between_40_and_60_inclusive_during_weekdays() {
        // arrange
        CigarParty cigarParty = new CigarParty();
        boolean isWeekend = false;

        // act
        boolean result = cigarParty.haveParty(40,isWeekend);

        // assert
        Assert.assertEquals("party should be successful if 40<= cigars <= 60",true, result);
    }

    @Test
    public void party_is_unsuccessful_if_cigars_lower_than_40_on_weekdays() {
        // arrange
        CigarParty cigarParty = new CigarParty();
        boolean isWeekend = false;

        // act
        boolean result = cigarParty.haveParty(39,isWeekend);

        // assert
        Assert.assertEquals("party should be successful if 40<= cigars <= 60",false, result);
    }

    @Test
    public void party_is_unsuccessful_if_cigars_higher_than_60_on_weekdays() {
        // arrange
        CigarParty cigarParty = new CigarParty();
        boolean isWeekend = false;

        // act
        boolean result = cigarParty.haveParty(61,isWeekend);

        // assert
        Assert.assertEquals("party should be successful if 40<= cigars <= 60",false, result);
    }

    @Test
    public void party_is_successful_if_cigars_between_at_least_40_on_weekends() {
        // arrange
        CigarParty cigarParty = new CigarParty();
        boolean isWeekend = true;

        // act
        boolean result = cigarParty.haveParty(40,isWeekend);

        // assert
        Assert.assertEquals("party should be successful if 40<= cigars <= 60",true, result);
    }

    @Test
    public void party_is_unsuccessful_if_cigars_lower_than_40_on_weekend() {
        // arrange
        CigarParty cigarParty = new CigarParty();
        boolean isWeekend = true;

        // act
        boolean result = cigarParty.haveParty(39,isWeekend);

        // assert
        Assert.assertEquals("party should be successful if 40<= cigars <= 60",false, result);
    }

    @Test
    public void party_is_successful_if_cigars_higher_than_60_on_weekend() {
        // arrange
        CigarParty cigarParty = new CigarParty();
        boolean isWeekend = true;

        // act
        boolean result = cigarParty.haveParty(61,isWeekend);

        // assert
        Assert.assertEquals("party should be successful if 40<= cigars <= 60",true, result);
    }

}
