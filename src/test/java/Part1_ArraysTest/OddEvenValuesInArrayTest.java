package Part1_ArraysTest;

import Part1_Arrays.OddEvenValuesInArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    //1. Positive testing Happy path
    @Test

    public void testEvenValuesInArray(){

        int[] array = {1, -2, 4, 7, -8, 9, 10, 1, -12, 0};
        int expectedResult = 6;
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);

    }

    //2. Positive testing Happy path
    @Test

    public void testOddValuesInArray(){

        int[] array = {1, -2, 4, 7, -8, 9, 10, 1, -12, 0};
        int expectedResult = 4;
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);

    }


    //3. Positive testing countOddEvenValuesInArray Happy path
    @Test
     public void testcountOddEvenValuesInArray_PositiveTest(){
        int[] array = {1, -2, 4, 7, -8, 9, 10, 1, -12, 0};
        int[] expectedResult = {6,4};
        int[] actualResult = new OddEvenValuesInArray().countOddEvenValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);

    }

    //4. Positive testing countOnlyEvenValuesInArray Happy path
    @Test
    public void testCountOnlyEvenValuesInArray_PositiveTest(){
        int[] array = {4, 6, 8, 8, 2, 0};
        int[] expectedResult = {6,0};
        int[] actualResult = new OddEvenValuesInArray().countOddEvenValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);

    }

    //5. Positive testing countOnlyOddValuesInArray Happy path
    @Test
    public void testCountOnlyOddValuesInArray_PositiveTest(){
        int[] array = {-3,-7, 5, 1, 21};
        int[] expectedResult = {0,5};
        int[] actualResult = new OddEvenValuesInArray().countOddEvenValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);

    }

    //6. Negative testing countEvenOddValuesInArray
    @Test
    public void testCountArrayIsNull_NegativeTest(){
        int[] array = {};
        int[] expectedResult = {};
        int[] actualResult = new OddEvenValuesInArray().countOddEvenValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);

    }

    //7. Positive testing createOddEvenArray
    @Test
    public void testcreateOddEvenArray_PositiveTest(){
        int[] array = {1, -2, 4, 7, -8, 9, 10, 1, -12, 0};
        int[][] expectedResult = {{-2, 4,-8, 10,-12, 0},{1, 7, 9, 1, 0, 0}};
        int[][] actualResult = new OddEvenValuesInArray().createOddEvenArray(array);

        Assert.assertEquals(actualResult,expectedResult);

    }



}
