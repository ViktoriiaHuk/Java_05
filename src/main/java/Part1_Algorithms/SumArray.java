package Part1_Algorithms;

public class SumArray {

    public int sumArray(int[] array) {

        if (array.length > 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }
        return 0;
    }

}
