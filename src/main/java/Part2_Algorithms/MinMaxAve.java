package Part2_Algorithms;

public class MinMaxAve {

    public int[] minMaxAve(int[] array, int x, int y) {
        if (array.length > 0 && x > 0 && y > 0 && x <= array.length - 1 && y <= array.length - 1 ) {
            int[] result = new int[3];

            for (int i = 0; i <= array.length; i++) {
                if (array[x] < array[y] || array[x] == array[y]) {
                    result[0] = array[x];
                    result[1] = array[y];
                    result[2] = array[(x + y) / 2];
                } else {
                    result[0] = array[y];
                    result[1] = array[x];
                    result[2] = array[(x + y) / 2];
                }
            }
            return result;
        }
        return new int[0];

    }
}
