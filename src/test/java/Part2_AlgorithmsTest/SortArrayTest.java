package Part2_AlgorithmsTest;

import Part2_Algorithms.SortArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

    //1.  Positive testing Happy path

    @Test
    public  void testSortArray(){

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};
        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //2.  Positive testing

    @Test
    public  void testSortArrayEqualsValue_PositiveTest(){

        int[] array = {2, 2, 2, 2, 2, 2, 2};
        int[] expectedResult = {2, 2, 2, 2, 2, 2, 2};
        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //3.  Positive testing

    @Test
    public  void testSortArrayNegativeValue_PositiveTest(){

        int[] array = {-8, 0, 5, 7, 3, -6, 1, 22};
        int[] expectedResult = {-8, -6, 0, 1, 3, 5, 7, 22};
        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //4.  Negative testing

    @Test
    public  void testSortArrayNegativeTest(){

        int[] array = {};
        int[] expectedResult = {};
        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

}
