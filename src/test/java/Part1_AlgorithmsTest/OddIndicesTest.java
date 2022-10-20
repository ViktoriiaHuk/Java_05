package Part1_AlgorithmsTest;

import Part1_Algorithms.OddIndices;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class OddIndicesTest {

    //1. Positive testing Happy path

    @Test

    public void testArray_PositiveTest() {
        int [] array = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult = {590, 985, 68};
        int [] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult,expectedResult);

    }

        //. Negative testing Happy path

        @Test

        public void testArray_NegativeTest() {
            int [] array = {};
            int [] expectedResult = {};
            int [] actualResult = new OddIndices().oddIndices(array);

            Assert.assertEquals(actualResult,expectedResult);

        }

}
