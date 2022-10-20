package Part2_AlgorithmsTest;

import Part2_Algorithms.MinMaxAve;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    // 1. Positive testing Happy path
    // x > y

    @Test

    public  void testMinMaxAve_X_Less_Y_HappyPath(){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = 2;
        int y = 6;

        int [] expectedResult = {3, 7, 5};
        int [] actualResult = new MinMaxAve().minMaxAve(array,x,y);

        Assert.assertEquals(actualResult,expectedResult);

    }

    // 2. Positive testing Happy path
    // x < y

    @Test

    public  void testMinMaxAve_Y_Less_X__HappyPath(){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = 6;
        int y = 2;

        int [] expectedResult = {3, 7, 5};
        int [] actualResult = new MinMaxAve().minMaxAve(array,x,y);

        Assert.assertEquals(actualResult,expectedResult);

    }

    // 3. Positive testing Happy path
    // x = y

    @Test

    public  void testMinMaxAve_Y_Equels_X__HappyPath(){
        int [] array = {1, 2, 2, 4, 5, 6, 7, 8};
        int x = 1;
        int y = 1;

        int [] expectedResult = {2, 2, 2};
        int [] actualResult = new MinMaxAve().minMaxAve(array,x,y);

        Assert.assertEquals(actualResult,expectedResult);

    }

    // 4. Positive testing Happy path
    // Negative_Value

    @Test

    public  void testMinMaxAve_Negative_Value_HappyPath(){
        int [] array = {-1, -2, -3, -4, -5, -6, -7, -8};
        int x = 2;
        int y = 4;

        int [] expectedResult = {-5, -3, -4};
        int [] actualResult = new MinMaxAve().minMaxAve(array,x,y);

        Assert.assertEquals(actualResult,expectedResult);

    }

    // 5. Negative testing Happy path
    // array = 0

    @Test

    public  void testMinMaxAve_ArrayIsNullNegativeTesting(){
        int [] array = {};
        int x = 2;
        int y = 4;

        int [] expectedResult = {};
        int [] actualResult = new MinMaxAve().minMaxAve(array,x,y);

        Assert.assertEquals(actualResult,expectedResult);

    }

    // 5. Negative testing Happy path
    // x < 0

    @Test

    public  void testMinMaxAve_xIsNegative_NegativeTesting(){
        int [] array = {1, 2, 2, 4, 5, 6, 7, 8};
        int x = -2;
        int y = 2;

        int [] expectedResult = {};
        int [] actualResult = new MinMaxAve().minMaxAve(array,x,y);

        Assert.assertEquals(actualResult,expectedResult);

    }

    // 6. Negative testing Happy path
    // x > array.length

    @Test

    public  void testMinMaxAve_xIsGreaterArray_NegativeTesting(){
        int [] array = {1, 2, 2, 4, 5, 6, 7, 8};
        int x = 10;
        int y = 2;

        int [] expectedResult = {};
        int [] actualResult = new MinMaxAve().minMaxAve(array,x,y);

        Assert.assertEquals(actualResult,expectedResult);

    }



}
