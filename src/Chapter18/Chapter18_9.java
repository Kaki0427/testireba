package Chapter18;

import java.util.Scanner;

public class Chapter18_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.print("Reversed string: ");
        reverseDisplay(input);
        System.out.println();
    }

    public static void reverseDisplay(String value) {
        if (value.length() == 0) {
            return;
        } else {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }
}
