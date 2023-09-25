package Chapter18;

import java.util.Scanner;

public class Chapter18_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter a character to count: ");
        char character = scanner.next().charAt(0);

        scanner.close();

        int count = count(input, character);
        System.out.println("The character '" + character + "' appears " + count + " times in the string.");
    }

    public static int count(String str, char a) {
        if (str.length() == 0) {
            return 0;
        } else {
            int currentCharCount = (str.charAt(0) == a) ? 1 : 0;
            int restOfStringCount = count(str.substring(1), a);
            return currentCharCount + restOfStringCount;
        }
    }
}
