import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
//Step 7.
public class MoveRentalTests {


//    Implement unit tests to validate the functionality of:
//    The rental price calculation
//    The late fee calculation


    @Test
    public void rentalPriceCalculationTest() {
        //arrange
        MovieRental movieRental = new MovieRental("There's Something About Mary","DVD",true);
        //act
        BigDecimal result = movieRental.getRentalPrice();
        //assert
        Assert.assertEquals("Rental Price should be $2.99 for a Premium DVD", BigDecimal.valueOf(2.99), result);
    }


    @Test
    public void lateFeeCalculationTest() {
        //arrange
        MovieRental movieRental = new MovieRental("There's Something About Mary","DVD",true);
        //act
        BigDecimal result = movieRental.lateFee(3);
        //assert
        Assert.assertEquals("Late Fee should be $19.99 for 3 days late", BigDecimal.valueOf(19.99), result);
    }

}
