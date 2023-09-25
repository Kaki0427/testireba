package Chapter22;

import java.util.Scanner;

public class Chapter22_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a series of numbers ending with 0: ");

        int currentNumber = input.nextInt();
        int longestNumber = currentNumber;
        int currentCount = 1;
        int longestCount = 1;

        while (currentNumber != 0) {
            int nextNumber = input.nextInt();

            if (nextNumber == currentNumber) {
                currentCount++;
            } else {
                if (currentCount > longestCount) {
                    longestCount = currentCount;
                    longestNumber = currentNumber;
                }
                currentCount = 1;
            }

            currentNumber = nextNumber;
        }

        if (longestCount > 1) {
            System.out.println("The longest same number sequence starts at index " +
                    "" + " with " + longestCount + " values of " + longestNumber);
        } else {
            System.out.println("There are no repeated numbers in the sequence.");
        }
    }
}
