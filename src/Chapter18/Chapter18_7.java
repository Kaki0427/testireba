package Chapter18;

public class Chapter18_7 {
    private static int count = 0;

    public static void main(String[] args) {
        int n = 50;

        System.out.println("Fibonacci number at index " + n + " is " + fib(n));
        System.out.println("The fib method was called " + count + " times.");
    }

    public static long fib(long index) {
        count++;

        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {

            long fibMinus1 = 1;
            long fibMinus2 = 0;
            long fib = 0;

            for (long i = 2; i <= index; i++) {

                fib = fibMinus1 + fibMinus2;
                fibMinus2 = fibMinus1;
                fibMinus1 = fib;
            }

            return fib;
        }
    }
}
