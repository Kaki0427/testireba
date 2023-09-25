package Chapter18;

import java.util.Scanner;

public class Chapter18_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long number = scanner.nextLong();

        scanner.close();

        int sum = sumDigits(number);
        System.out.println("The sum of the digits is: " + sum);
    }

    public static int sumDigits(long n) {
        if (n == 0) {
            return 0;
        } else {
            int lastDigit = (int) (n % 10);
            return lastDigit + sumDigits(n / 10);
        }
    }
}
