import org.junit.Assert;
import org.junit.Test;

public class SwapEndsKataTests {

    @Test
    public void one_element_array_returns_array_with_one_element() {
        // arrange
        int[] input = {1};

        // act
        SwapEndsKata sut = new SwapEndsKata();
        int[] actual = sut.swapEnds(input);

        //assert
        int[] expected = {1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void two_element_array_swaps_ends() {
        // arrange
        int[] input = {1,2};

        // act
        SwapEndsKata sut = new SwapEndsKata();
        int[] actual = sut.swapEnds(input);

        // assert
        int[] expected = {2,1};
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void three_element_array_swaps_ends() {
        // arrange
        int[] input = {1,2,3};

        // act
        SwapEndsKata sut = new SwapEndsKata();
        int[] actual = sut.swapEnds(input);

        // assert
        int[] expected = {3, 2,1};
        Assert.assertArrayEquals(expected, actual);

    }

}
