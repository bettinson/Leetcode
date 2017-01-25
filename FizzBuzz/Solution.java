import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> buzz = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                buzz.add("FizzBuzz");
            } else if (i % 3 == 0) {
                buzz.add("Fizz");
            } else if (i % 5 == 0) {
                buzz.add("Buzz");
            } else {
                buzz.add(String.valueOf(i));
            }
        }
        return buzz;
    }
}