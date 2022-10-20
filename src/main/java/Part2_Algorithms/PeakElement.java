package Part2_Algorithms;

public class PeakElement {

    public int[] peakElement(int[] array) {
        if (array.length > 0) {

            int l = 0;
            for (int i = 0; i < array.length; i++) {

                if (i == 0) {
                    if (array[0] > array[1]) {
                        l++;
                    }
                } else if (i == array.length - 1 && array[i] > array[i - 1]) {
                    l++;
                } else if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    l++;
                }
            }

            int[] resultArray = new int[l];
            int resultArrayIndex = 0;

            for (int i = 0; i < array.length; i++) {
//            int currentValue = array[i];

                if (i == 0) {
                    if (array[0] > array[1]) {
                        resultArray[resultArrayIndex] = array[0];
                        resultArrayIndex++;
                    }
                } else if (i == array.length - 1 && array[i] > array[i - 1]) {
                    resultArray[resultArrayIndex] = array[i];
                } else if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    resultArray[resultArrayIndex] = array[i];
                    resultArrayIndex++;
                }
            }
            return resultArray;
        }
        return new int[0];
    }

}
