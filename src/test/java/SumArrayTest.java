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


}
