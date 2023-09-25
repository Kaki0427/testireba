package Chapter18;

import java.util.Scanner;

public class Chapter18_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = input.nextInt();
        input.close();

        String binary = dec2Bin(decimalNumber);
        System.out.println("Binary equivalent: " + binary);
    }

    public static String dec2Bin(int value) {
        if (value == 0) {
            return "0";
        } else if (value == 1) {
            return "1";
        } else {
            int remainder = value % 2;
            int quotient = value / 2;
            String previousBinary = dec2Bin(quotient);
            return previousBinary + remainder;
        }
    }
}
