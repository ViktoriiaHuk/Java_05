public class OddIndices {


    public int[] oddIndices(int[] array) {

        int l = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0){
                l++;
            }
        }

        int[] result = new int[l];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                result[j++] = array[i];
            }
        }
        return result;
    }



}
