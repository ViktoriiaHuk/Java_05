package Part1_AlgorithmsTest;

import Part1_Algorithms.SumArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    //1. Positive testing Happy path
    // [i] > 0

    @Test
    public void  testPositiveValueSumArray (){

        int [] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;
        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult,expectedResult);

    }

    //2. Positive testing Happy path
    // [i] < 0

    @Test
    public void  testNegativeValueSumArray (){

        int [] array = {-7, -3};
        int expectedResult = -10;
        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult,expectedResult);

    }

    //3. Positive testing Happy path
    // sum  = 0

    @Test
    public void  testSumArrayIsZero(){

        int [] array = {-7, 7};
        int expectedResult = 0;
        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult,expectedResult);

    }

    //4. Positive testing Happy path
    // [i]  0

    @Test
    public void  testSumArrayNegativeTest (){

        int [] array = {};
        int expectedResult = 0;
        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult,expectedResult);

    }


}
