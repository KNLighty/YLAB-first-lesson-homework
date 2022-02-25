public class FibonacciCache {
    static int[] cache = new int[100];

    public static int fib(int n) {
        if (cache[n] == 0) {
            if (n == 0) {
                cache[n] = 0;
            } else if (n == 1 || n == 2) {
                cache[n] = 1;
            } else {
                cache[n] = fib(n - 1) + fib(n - 2);
            }
        }

        return cache[n];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 13; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
