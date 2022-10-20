package Part1_ArraysTest;

import Part1_Arrays.ManipulationsWithArrays;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    //1. Positive testing Happy path
    @Test

    public void testManipulationsWithArraysInt_HappyPat() {
        int[] array = {1, 2, 3, 4, 5};
        int number = 3;
        int[] expectedResult = {3, 6, 9, 12, 15};
        int[] actualResult = new ManipulationsWithArrays().manipulationsWithArrays(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Positive testing Happy path
    @Test

    public void testToDoubleArray_HappyPat() {
        int[] array = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //3.Positive testing Happy path
    @Test

    public void testToIntArray_HappyPat() {
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //4.Positive testing Happy path
    @Test

    public void testToStringArrayInt() {
        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};
        String[] actualResult = new ManipulationsWithArrays().toStringArrayInt(array);

        Assert.assertEquals(expectedResult, actualResult);
    }

    //5.Positive testing Happy path
    @Test

    public void testToStringArrayDouble() {
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};
        String[] actualResult = new ManipulationsWithArrays().toStringArrayDouble(array);

        Assert.assertEquals(expectedResult, actualResult);
    }

    //6.Positive testing Happy path

    @Test
    public void testAreValuesGreaterThanNumber_HappyPath() {
        int[] array = {1, 4, 3, 5, 7, 2, 8, 1, 3};
        int number = 0;
        boolean expectedResult = true;
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);


        Assert.assertEquals(actualResult, expectedResult);

    }

    //7.Negative testing

    @Test
    public void testAreValuesGreaterThanNumber_NegativeTest() {
        int[] array = {1, 4, 3, 5, 7, 2, 8, 1, 3};
        int number = 2;
        boolean expectedResult = false;
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);


        Assert.assertEquals(actualResult, expectedResult);

    }


    //9. Positive testing Happy path

    @Test

    public void testGetTheFirstMoreSecondGreaterHalf() {
        int[] array = {9, 4, 10, 5, 7, 2, 8, 3};
        int[] expectedResult = {9, 4, 10, 5};
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //10. Positive testing Happy path

    @Test

    public void testGetTheSecondMoreFirstGreaterHalf() {
        int[] array = {9, 4, 1, 5, 7, 2, 8, 3};
        int[] expectedResult = {7, 2, 8, 3};
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //11. Positive testing

    @Test

    public void testGetTheEqualsValueGreaterHalf() {
        int[] array = {6, 6, 4, 4, 5, 5, 4, 4};
        int[] expectedResult = {6, 6, 4, 4};
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //12. Positive testing

    @Test
    public void testGetTherHalf_OddIndex() {
        int[] array = {6, 6, 4, 4, 5, 5, 3, 4, 4};
        int[] expectedResult = {6, 6, 4, 4, 5};
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //13. Positive testing

    @Test
    public void testGetTherHalf_OneIndex() {
        int[] array = {6};
        int[] expectedResult = {6};
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(array);

        Assert.assertEquals(actualResult, expectedResult);

    }



    //14. Negative test

    @Test
    public void testGetTherHalf_NegativeTest() {
        int[] array = {};
        int[] expectedResult = {};
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(array);

        Assert.assertEquals(actualResult, expectedResult);

    }


}
