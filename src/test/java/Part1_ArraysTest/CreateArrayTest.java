package Part1_ArraysTest;

import Part1_Arrays.CreateArray;
import Part1_Arrays.ManipulationsWithArrays;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    //1. Positive testing Happy path
    // int x
    @Test
    public void  testCreateArrayInt_Happy(){
        int x1 = 1;
        int x2 = 2;
        int x3 = 3;
        int x4 = 4;
        int x5 = 5;
        int[]expectedResult = {1, 2, 3, 4, 5};
        int[]actualResult = new CreateArray().createArray(x1,x2,x3,x4,x5);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //2. Positive testing Happy path
    // double x
    @Test
    public void  testCreateArrayDouble_Happy(){
        double x1 = 1.1;
        double x2 = 2.5;
        double x3 = 3.7;
        double x4 = 4.0;
        double x5 = 5.5;
        double[]expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};
        double[]actualResult = new CreateArray().createArray(x1,x2,x3,x4,x5);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //3. Positive testing Happy path
    // String x
    @Test
    public void  testCreateArrayString_Happy(){
        String x1 = "It";
        String x2 = "was";
        String x3 = "an";
        String x4 = "apple";
        String x5 = "pie";
        String[]expectedResult = {"It", "was", "an", "apple", "pie"};
        String[]actualResult = new CreateArray().createArray(x1,x2,x3,x4,x5);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //3. Positive testing Happy path
    // String text
    @Test
    public void  testCreateArrayStringText_Happy(){
        String s = "It was an apple pie";
        String[]expectedResult = {"It", "was", "an", "apple", "pie"};
        String[]actualResult = new CreateArray().createArrayFromText(s);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //4. Positive testing Happy path
    @Test
    public void  testMultiplesOf_Happy_path(){

        int number = 5;
        int[]expectedResult = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int[]actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult,expectedResult);

    }

    //5. Negative testing
    // number = 0
    @Test
    public void  testMultiplesOf_NegativeTest(){

        int number = 0;
        int[]expectedResult = {};
        int[]actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult,expectedResult);

    }

    // 6. Positive testing Happy path
    @Test
    public void testCreateIntArrayFromText_Happy_path(){

        String line = "3 4 1 8 10 12.3";
        int[] expectedResult = {3, 4, 1, 8, 10, 12};
        int[] actualResult= new CreateArray().createIntArrayFromText(line);

        Assert.assertEquals(actualResult, expectedResult);

    }

    // 7. Positive testing Happy path
    @Test
    public void testCreateIntArrayNegativeValueFromText(){

        String line = "3 4 -1.8 -8 10 12.3";
        int[] expectedResult = {3, 4, -1, -8, 10, 12};
        int[] actualResult= new CreateArray().createIntArrayFromText(line);

        Assert.assertEquals(actualResult, expectedResult);

    }


    //8. Negative test
    @Test
    public void testCreateIntArrayNegativeTest(){

        String line = " ";
        int[] expectedResult = {};
        int[] actualResult= new CreateArray().createIntArrayFromText(line);

        Assert.assertEquals(actualResult, expectedResult);

    }

}
