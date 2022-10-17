import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    //1. Positive testing Happy path
    // x > 0

    @Test

    public  void testXisPositiveNumber() {
        int x = 555;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(x);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Positive testing Happy path
    // x = 0

    @Test

    public  void testXisEqualsNullNumber() {
         int x = 0;
         boolean expectedResult = true;
         boolean actualResult = new IsPositiveNumber().isPositiveNumber(x);

         Assert.assertEquals(actualResult,expectedResult);

    }

    //2. Positive testing Happy path
    // x < 0

    @Test

    public  void testXisNegativeNumber() {
        int x = -555;
        boolean expectedResult = false;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(x);

        Assert.assertEquals(actualResult,expectedResult);

    }


}
