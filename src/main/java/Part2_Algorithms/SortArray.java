package Part2_Algorithms;

public class SortArray {

    public int[] sortArray(int[] inputArray) {
        if (inputArray.length > 0) {
            boolean sorted = false;
            int tmp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < inputArray.length - 1; i++) {
                    if (inputArray[i] > inputArray[i + 1]) {
                        tmp = inputArray[i];
                        inputArray[i] = inputArray[i + 1];
                        inputArray[i + 1] = tmp;
                        sorted = false;
                    }
                }
            }
            return inputArray;
        }
        return new int[0];
    }
}
