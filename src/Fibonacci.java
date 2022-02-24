public class Fibonacci {
    // рекурсивная реализация
    public static int fibRecursion(int n) {
        if (n <= 1) return n; // базовый случай
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }

    // реализация в цикле с использование памяти (массив)
    public static void fibWithMemory(int n) {
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(f[i] + " ");
        }
    }

    // реализация без использования массива
    public static int fibWithMemoryOpt(int n) {
        int first = 0;
        int second = 1;
        int result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Рекурсивная реализация:");
        for (int i = 0; i < 13; i++) System.out.print(fibRecursion(i) + " ");
        System.out.println();
        System.out.println("Реализация в цикле с использование памяти 1-й вариант:");
        fibWithMemory(13);
        System.out.println();
        System.out.println("Реализация в цикле с использование памяти 2-й вариант:");
        for (int i = 0; i < 13; i++) System.out.print(fibWithMemoryOpt(i) + " ");
        System.out.println();
    }
}