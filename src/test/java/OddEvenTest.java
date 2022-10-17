import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    //1. Positive testing Happy path
    // if (x % 2 == 0)

    @Test

    public void testEvenNumber() {
        int x = 22222;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddIndices(x);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //2. Positive testing Happy path
    // if (x % 2 != 0)

    @Test

    public void testOddNumber() {
        int x = -345;
        String expectedResult = "Odd";
        String actualResult = new OddEven().oddIndices(x);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //.3 Positive testing Happy path
    // if (x = 0)

    @Test

    public void testNullNumber() {
        int x = 0;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddIndices(x);

        Assert.assertEquals(actualResult,expectedResult);
    }


}
