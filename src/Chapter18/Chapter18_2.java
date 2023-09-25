package Chapter18;

import java.util.Scanner;

public class Chapter18_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an index to find the Fibonacci number: ");
        int index = input.nextInt();

        long result = fib(index);
        System.out.println("Fibonacci number at index " + index + " is: " + result);
    }

    public static long fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long f0 = 0;
            long f1 = 1;
            long currentFib = 0;

            for (int i = 2; i <= n; i++) {
                currentFib = f0 + f1;
                f0 = f1;
                f1 = currentFib;
            }

            return currentFib;
        }
    }
}

