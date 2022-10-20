package Part2_AlgorithmsTest;

import Part2_Algorithms.ReverseArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    //1. Positive testing Happy path
    @Test
    public void testReverseArray_HappyPath(){

        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};
        int[] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //2. Positive testing
    @Test
    public void testReverseArrayEqualsValue_PositiveTest(){

        int[] array = {2, 2, 2, 2};
        int[] expectedResult = {2, 2, 2, 2};
        int[] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //3. Positive testing h
    @Test
    public void testReverseArrayOneEqualsValue_PositiveTest(){

        int[] array = {1};
        int[] expectedResult = {1};
        int[] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //4. Positive testing
    @Test
    public void testReverseArrayNegativeValue_PositiveTest(){

        int[] array = {-1, -4, -8, -2};
        int[] expectedResult = {-2, -8, -4, -1};
        int[] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //5. Negative testing
    @Test
    public void testReverseArrayNegativeTest(){

        int[] array = {};
        int[] expectedResult = {};
        int[] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

}
