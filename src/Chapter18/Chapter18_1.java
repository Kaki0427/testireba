package Chapter18;

import java.math.BigInteger;
import java.util.Scanner;

public class Chapter18_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            BigInteger result = factorial(BigInteger.valueOf(n));
            System.out.println(n + "! = " + result);
        }
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
