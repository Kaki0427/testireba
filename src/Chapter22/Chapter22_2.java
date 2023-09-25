package Chapter22;

import java.util.Scanner;

public class Chapter22_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String result = findMaxIncreasingSubsequence(str);
        System.out.println("Maximum increasingly ordered subsequence: " + result);
    }

    public static String findMaxIncreasingSubsequence(String str) {
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
            }
        }

        int startIndex = endIndex - maxLength + 1;
        return str.substring(startIndex, endIndex + 1);
    }
}
