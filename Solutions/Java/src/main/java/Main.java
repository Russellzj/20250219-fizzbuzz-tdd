import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isDivisible(int num, int divisor) {
        return num % divisor == 0;
    }

    public static String fizzBuzz(int num) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "Fizz");
        map.put(5, "Buzz");
        map.put(7, "Bazz");
        map.put(8, "Bozz");
        List<String> word = new ArrayList<>();
        if (isPositive(num)) {
            for (int i : map.keySet()) {
                if (isDivisible(num, i)) {
                    word.add(map.get(i));
                }
            }
        }
        return String.join(" ", word);
    }
}
