package Part2_AlgorithmsTest;

import Part2_Algorithms.Intersection;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {

    //1. Positive testing Happy path

    @Test
    public void testIntersection_1_HappyPath (){
        int [] array1 = { 1, 2, 4, 5, 89 };
        int [] array2 = {8, 9, 4, 2};
        int [] expectedResult = {2, 4};
        int [] actualResult = new Intersection().intersection(array1,array2);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //2. Positive testing Happy path

    @Test
    public void testIntersection_2_HappyPath (){
        int [] array1 = {1, 2, 4, 5, 8, 9};
        int [] array2 = {8, 9, -4, -2};
        int [] expectedResult = {8, 9};
        int [] actualResult = new Intersection().intersection(array1,array2);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //3. Positive testing Happy path

    @Test
    public void testIntersection_3_HappyPath (){
        int [] array1 = {1, 2, 4, 5, 89};
        int [] array2 = {8, 9, 45};
        int [] expectedResult = {};
        int [] actualResult = new Intersection().intersection(array1,array2);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //3. Positive testing Happy path

    @Test
    public void testIntersection_4_HappyPath (){
        int [] array1 = {1, 1, 1, 1, 1};
        int [] array2 = {1};
        int [] expectedResult = {1, 1, 1, 1, 1};
        int [] actualResult = new Intersection().intersection(array1,array2);

        Assert.assertEquals(actualResult,expectedResult);
    }

    // 5. Negative testing

    @Test
    public void testIntersection_Array1IsNull_Negtive (){
        int [] array1 = {};
        int [] array2 = {8, 9, 45};
        int [] expectedResult = {};
        int [] actualResult = new Intersection().intersection(array1,array2);

        Assert.assertEquals(actualResult,expectedResult);
    }

    // 6. Negative testing

    @Test
    public void testIntersection_Array1and2IsNull_Negtive (){
        int [] array1 = {};
        int [] array2 = {};
        int [] expectedResult = {};
        int [] actualResult = new Intersection().intersection(array1,array2);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
