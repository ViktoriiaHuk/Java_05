package Part1_Algorithms;

public class IsPositiveNumber {

    public boolean isPositiveNumber(int x) {
        boolean result = false;

        if (x > 0 || x == 0) {
            result = true;
        } else {
            result = false;
        }
        return  result;
    }

}
