package Part1_AlgorithmsTest;

import Part1_Algorithms.AreNumbersEqual;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    //1. Positive testing Happy path
    // x > y

    @Test

    public void testXLessY_HappyPath(){
        int x = 89;
        int y = -89;
        int expectedResult = 1;
        int actualResult =  new AreNumbersEqual().areNumbersEqual(x,y);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //2. Positive testing Happy path
    // x = y

    @Test

    public void testXEqualsY_HappyPath(){
        int x = 89;
        int y = 89;
        int expectedResult = 0;
        int actualResult =  new AreNumbersEqual().areNumbersEqual(x,y);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //3. Positive testing Happy path
    // x <y

    @Test

    public void testYLessX_HappyPath(){
        int x = -89;
        int y = 89;
        int expectedResult = -1;
        int actualResult =  new AreNumbersEqual().areNumbersEqual(x,y);

        Assert.assertEquals(actualResult,expectedResult);
    }


}
