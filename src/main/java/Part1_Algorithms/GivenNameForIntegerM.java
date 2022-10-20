package Part1_Algorithms;

public class GivenNameForIntegerM {

    public String givenNameForIntegerM(int m) {
        String result;

        if (m % 7 == 0 && m % 9 == 0) {
            result = "Good Number";
        } else if (m % 9 == 0 && m % 7 != 0) {
            result = "Bad Number";
        } else if (m % 11 == 0) {
            result = "Poor Number";
        } else {
            result = "-1";
        }
        return result;
    }

}
