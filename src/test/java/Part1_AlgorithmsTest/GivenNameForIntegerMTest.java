package Part1_AlgorithmsTest;

import Part1_Algorithms.GivenNameForIntegerM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GivenNameForIntegerMTest {

    //1. Positive testing Happy path
    // m % 7 == 0 && m% 9== 0

    @Test

    public void testGivenNameForIntegerMTes_7_9_HappyPath(){
         int m = 63;
         String expectedResult = "Good Number";
         String actualResult = new GivenNameForIntegerM().givenNameForIntegerM(m);

        Assert.assertEquals(actualResult,expectedResult);

    }

    //2. Positive testing Happy path
    // m % 7 != 0 && m % 9== 0

    @Test

    public void testGivenNameForIntegerMTes_9_HappyPath(){
        int m = 27;
        String expectedResult = "Bad Number";
        String actualResult = new GivenNameForIntegerM().givenNameForIntegerM(m);

        Assert.assertEquals(actualResult,expectedResult);

    }

    //3. Positive testing Happy path
    // m % 11 == 0 ;

    @Test

    public void testGivenNameForIntegerMTes_11_HappyPath() {
        int m = 66;
        String expectedResult = "Poor Number";
        String actualResult = new GivenNameForIntegerM().givenNameForIntegerM(m);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //4. Positive testing Happy path
    // m % 11 == 0 && m % 9 ==0 ;

    @Test

    public void testGivenNameForIntegerMTes_11_9_HappyPath() {
        int m = 99;
        String expectedResult = "Bad Number";
        String actualResult = new GivenNameForIntegerM().givenNameForIntegerM(m);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //5. Positive testing Happy path
    // m % 11 == 0 ;

    @Test

    public void testGivenNameForIntegerMTest_11_HappyPath() {
        int m = 42;
        String expectedResult = "-1";
        String actualResult = new GivenNameForIntegerM().givenNameForIntegerM(m);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //6. Positive testing Happy path
    // if m = 0 ;

    @Test

    public void testGivenNameForIntegerMTest_IfMIsNull_HappyPath() {
        int m = 0;
        String expectedResult = "Good Number";
        String actualResult = new GivenNameForIntegerM().givenNameForIntegerM(m);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
