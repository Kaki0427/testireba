package Chapter18;

import java.util.Scanner;

public class Chapter18_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        scanner.close();

        reverseDisplay(input);
    }

    public static void reverseDisplay(String value) {
        reverseDisplay(value, value.length() - 1);
    }

    public static void reverseDisplay(String value, int high) {
        if (high >= 0) {
            System.out.print(value.charAt(high));
            reverseDisplay(value, high - 1);
        }
    }
}
