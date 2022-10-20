package Part2_Algorithms;

public class ReverseArray {

    public int[] reverseArray(int[] array) {
        if (array.length > 0) {

            int[] reverseArray = new int[array.length];
            int reversArrayIndex = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                reverseArray[reversArrayIndex] = array[i];
                reversArrayIndex++;
            }
            return reverseArray;
        }
        return new int[0];
    }

}
