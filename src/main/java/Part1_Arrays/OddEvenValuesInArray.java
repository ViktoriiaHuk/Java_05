package Part1_Arrays;

public class OddEvenValuesInArray {

    public int countEvenValuesInArray(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value % 2 == 0 || value == 0) {
                count++;
            }
        }
        return count;
    }


    public int countOddValuesInArray(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value % 2 != 0 && value != 0) {
                count++;
            }
        }
        return count;
    }

    public int[] countOddEvenValuesInArray(int[] array) {
        int[] oddEvenArray = new int[2];
        if (array.length != 0) {
            oddEvenArray[0] = countEvenValuesInArray(array);
            oddEvenArray[1] = countOddValuesInArray(array);
        } else {
            oddEvenArray = new int[0];
        }
        return oddEvenArray;
    }

    public int[][] createOddEvenArray(int[] array) {
        if (array.length != 0) {

            int l = countEvenValuesInArray(array);
            int[][] newArray = new int[2][l];
            int indexI = 0;
            int indexJ = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0 || array[i] == 0) {
                    newArray[0][indexI] = array[i];
                    indexI++;
                } else if(array[i] % 2 != 0 || array[i] != 0) {
                    newArray[1][indexJ] = array[i];
                    indexJ++;
                }
            }
            return newArray;
        }
        return new int[0][0];
    }



}
