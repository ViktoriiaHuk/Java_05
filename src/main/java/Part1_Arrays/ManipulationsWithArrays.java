package Part1_Arrays;

public class ManipulationsWithArrays {

    public int[] manipulationsWithArrays(int[] array, int number) {

        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * number;
        }
        return newArray;
    }

    public double[] toDoubleArray(int[] array) {

        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = (double) array[i];
        }
        return newArray;
    }

    public int[] toIntArray(double[] array) {

        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = (int) array[i];
        }
        return newArray;
    }

    public String[] toStringArrayInt(int[] array) {

        String[] newArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = "" + array[i];
        }
        return newArray;

    }

    public String[] toStringArrayDouble(double[] array) {

        String[] newArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = "" + array[i];
        }
        return newArray;

    }

    public boolean areValuesGreaterThanNumber(int[] array, int number) {

        boolean result = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public int[] getTheGreaterHalf(int[] array) {
        if (array.length > 0) {

            int startIndex = 0;
            int endIndex = array.length - 1;
            int middleIndex = endIndex / 2;

            System.out.println(middleIndex);

            int[] first = new int[middleIndex + 1];
            int[] second = new int[array.length - 1 - middleIndex];
            int[] resultArray = new int[0];


            int firstSum = 0;
            int secondSum = 0;

            for (int i = 0; i <= endIndex; i++) {
                if (i <= middleIndex) {
                    firstSum += array[i];
                } else {
                    secondSum += array[i];
                }
            }
            if (firstSum > secondSum) {
                for (int i = 0; i <= middleIndex; i++) {
                    first[i] = array[i];
                    resultArray = first;
                }
            } else {
                for (int i = 0; i < array.length - 1 - middleIndex; i++) {
                    second[i] = array[i + middleIndex + 1];
                    resultArray = second;
                }
            }
            return resultArray;
        }
        return new int[0];
    }


}
