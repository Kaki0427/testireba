package Chapter18;

import java.util.Scanner;

public class Chapter18_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = scanner.nextInt();
        scanner.close();

        System.out.print("Reversed integer: ");
        reverseDisplay(value);
        System.out.println();
    }

    public static void reverseDisplay(int value) {
        if (value < 10) {
            System.out.print(value);
        } else {
            System.out.print(value % 10);
            reverseDisplay(value / 10);
        }
    }
}

