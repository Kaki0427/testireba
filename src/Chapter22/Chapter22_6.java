package Chapter22;

public class Chapter22_6{
    public static void main(String[] args) {
        System.out.println("Index  |  GCD Execution Time (Listing 22.3)  |  GCD Execution Time (Listing 22.4)");
        System.out.println("-------|------------------------------------|------------------------------------");

        for (int i = 40; i <= 45; i++) {
            long fib1 = fib(i);
            long fib2 = fib(i + 1);

            long startTime1 = System.nanoTime();
            long gcd1 = gcdUsingEuclideanAlgorithm(fib1, fib2);
            long endTime1 = System.nanoTime();
            long executionTime1 = endTime1 - startTime1;

            long startTime2 = System.nanoTime();
            long gcd2 = gcdUsingRecursion(fib1, fib2);
            long endTime2 = System.nanoTime();
            long executionTime2 = endTime2 - startTime2;

            System.out.printf("%-7d|%-36d|%-36d%n", i, executionTime1, executionTime2);
        }
    }

    public static long fib(int n) {
        if (n <= 1) {
            return n;
        }

        long fib = 1;
        long prevFib = 1;

        for (int i = 2; i < n; i++) {
            long temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }

    public static long gcdUsingEuclideanAlgorithm(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long gcdUsingRecursion(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcdUsingRecursion(b, a % b);
        }
    }
}
