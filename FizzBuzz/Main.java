import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> buzz = sol.fizzBuzz(15);

        for (String b : buzz) {
            System.out.println(b);
        }
    }
}