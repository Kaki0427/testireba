package Chapter18;

import java.util.Scanner;

public class Chapter18_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = input.nextInt();
        input.close();

        String hexadecimal = dec2Hex(decimalNumber);
        System.out.println("Hexadecimal equivalent: " + hexadecimal);
    }

    public static String dec2Hex(int value) {
        if (value == 0) {
            return "0";
        } else {
            int remainder = value % 16;
            int quotient = value / 16;
            String previousHex = dec2Hex(quotient);
            char hexDigit;
            if (remainder < 10) {
                hexDigit = (char) ('0' + remainder);
            } else {
                hexDigit = (char) ('A' + remainder - 10);
            }
            return previousHex + hexDigit;
        }
    }
}
