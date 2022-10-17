public class AreNumbersEqual {

    public int areNumbersEqual(int x, int y) {
        int result = 0;

        if (x > y) {
            result = 1;
        } else if (x == y) {
            result = 0;
        } else {
            result = -1;
        }
        return result;
    }

}
