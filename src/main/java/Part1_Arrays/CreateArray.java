package Part1_Arrays;

public class CreateArray {

    public int[] createArray(int x1, int x2, int x3, int x4, int x5) {

        int[] array = new int[5];
        array[0] = x1;
        array[1] = x2;
        array[2] = x3;
        array[3] = x4;
        array[4] = x5;
        return array;
    }

    public double[] createArray(double x1, double x2, double x3, double x4, double x5) {

        double[] array = new double[5];
        array[0] = x1;
        array[1] = x2;
        array[2] = x3;
        array[3] = x4;
        array[4] = x5;
        return array;
    }

    public String[] createArray(String x1, String x2, String x3, String x4, String x5) {

        String[] array = new String[5];
        array[0] = x1;
        array[1] = x2;
        array[2] = x3;
        array[3] = x4;
        array[4] = x5;
        return array;
    }

    public String[] createArrayFromText(String s) {

        String[] array = s.split(" ");

        return array;
    }

    public int[] multiplesOf(int number) {
        if (number > 0 && number <= 10) {

            int[] arrayBasa = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] newArray = new ManipulationsWithArrays().manipulationsWithArrays(arrayBasa, number);
            return newArray;

        }
        return new int[0];
    }

    public int[] createIntArrayFromText(String line) {
        if (line != null) {

            String[] line1 = createArrayFromText(line);
            int[] resultArray = new int[line1.length];

            for (int i = 0; i < line1.length; i++) {

                resultArray[i] = (int) Double.parseDouble(line1[i]);
            }

            return resultArray;
        }
        return new int[0];
    }


}
