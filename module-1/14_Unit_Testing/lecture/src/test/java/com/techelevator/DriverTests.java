package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DriverTests {

    private Driver driver;

    @Before
    public void setup() {
        this.driver = new Driver();
    }

    @After
    public void cleanup(){
        this.driver = null; // this is not necessary. for demo purposes only
        System.out.println("running cleanup");
    }

    @Test
    public void whenDriverHasPermitAndWithLicensedDriver_ReturnTrue() {

        // arrange
        boolean hasPermit = true;
        boolean withLicensedDriver = true;

        // act
        boolean result = this.driver.canDrive(hasPermit, withLicensedDriver);

        // assert
        Assert.assertTrue("should be able to drive", result);

    }

    @Test
    public void when_driver_has_permit_but_not_with_licensed_driver() {

        // arrange
        boolean hasPermit = true;
        boolean withLicensedDriver = false;

        // act
                boolean result = this.driver.canDrive(hasPermit, withLicensedDriver);

        // assert
        Assert.assertFalse("can't drive without licensed driver", result);

    }

}
