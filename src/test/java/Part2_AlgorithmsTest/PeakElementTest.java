package Part2_AlgorithmsTest;

import Part2_Algorithms.PeakElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {

    //1. Positive testing Happy path
    @Test
    public void testPeakElement_HappyPath(){
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};
        int[] actualResul = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResul,expectedResult);

    }

    //2. Positive testing Happy path
    @Test
    public void testPeakElement_OneValue_PositiveTest(){
        int[] array = {2, 2, 2, 5, 1, 9, 9, 9};
        int[] expectedResult = {5};
        int[] actualResul = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResul,expectedResult);

    }

    //3. Positive testing Happy path
    @Test
    public void testPeakElement_EqualsValue_PositiveTest(){
        int[] array = {2, 2, 2, 2, 2, 2, 2, 2};
        int[] expectedResult = {};
        int[] actualResul = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResul,expectedResult);

    }

    //4. Positive testing Happy path
    @Test
    public void testPeakElement_FirstAndLastValue_PositiveTest(){
        int[] array = {8, 2, 2, 2, 2, 2, 2,7};
        int[] expectedResult = {8, 7};
        int[] actualResul = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResul,expectedResult);

    }



}
