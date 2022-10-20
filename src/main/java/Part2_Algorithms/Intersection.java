package Part2_Algorithms;

public class Intersection {


    public int[] intersection(int[] array1, int[] array2) {
        if (array1.length > 0 && array2.length > 0) {
            int l = 0;

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        l++;
                    }
                }
            }

            int[] result = new int[l];
            int resultIndex = 0;

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        result[resultIndex] = array1[i];
                        resultIndex++;
                    }
                }
            }
            return result;
        }
        return new int[0];
    }
}

