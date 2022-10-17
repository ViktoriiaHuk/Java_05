public class OddEven {

    public String oddIndices( int x){
        String result;
        if (x % 2 == 0 ){
            result = "Even";
        } else {
            result = "Odd";
        }
        return  result;
    }
}
