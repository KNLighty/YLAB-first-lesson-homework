import java.util.HashMap;

// реализация с HashMap
public class FibonacciHashMap {
    private static HashMap<Integer, Integer> cache = new HashMap<>();

    public static int fib(int n) {
        int result;

        if (cache.containsKey(n)) return cache.get(n);

        if (n == 0) result = 0;
        else if (n == 1) result = 1;
        else result = fib(n - 1) + fib(n - 2);
        cache.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Реализация с HashMap:");
        for (int i = 0; i < 13; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
