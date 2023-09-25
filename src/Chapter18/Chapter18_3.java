package Chapter18;

import java.util.Scanner;

public class Chapter18_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int m = input.nextInt();

        System.out.print("Enter the second integer: ");
        int n = input.nextInt();

        int gcd = gcd(m, n);
        System.out.println("The GCD of " + m + " and " + n + " is: " + gcd);
    }

    public static int gcd(int m, int n) {
        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }
}
