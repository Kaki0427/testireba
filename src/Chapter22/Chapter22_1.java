package Chapter22;

import java.util.Scanner;

public class Chapter22_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String result = findMaxConsecutiveSubstring(str);
        System.out.println("Maximum consecutive increasingly ordered substring: " + result);
    }

    public static String findMaxConsecutiveSubstring(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        int maxLength = 0;
        int currentLength = 1;
        int endIndex = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) < str.charAt(i + 1)) {
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    endIndex = i + 1;
                }
            } else {
                currentLength = 1;
            }
        }

        return str.substring(endIndex - maxLength + 1, endIndex + 1);
    }
}
