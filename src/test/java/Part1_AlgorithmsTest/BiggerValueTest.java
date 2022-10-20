package Part1_AlgorithmsTest;

import Part1_Algorithms.BiggerValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    //1. Positive testing Happy path
    // x > y

     @Test
    public void testXbiggerYHappyPath() {
         int x = 3333;
         int y = 9999;
         int expectedResult = 9999;
         int actualResult = new BiggerValue().biggerValue(x, y);

         Assert.assertEquals(actualResult, expectedResult);
     }

    //2. Positive testing Happy path
    // x < y
    @Test
    public void testYbiggerXHappyPath() {
        int x = 9999;
        int y = 3333;
        int expectedResult = 9999;
        int actualResult = new BiggerValue().biggerValue(x, y);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Positive testing Happy path
    // x = y

    @Test
    public void testYEqualsXHappyPath() {
        int x = 9999;
        int y = 9999;
        int expectedResult = 9999;
        int actualResult = new BiggerValue().biggerValue(x, y);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
