package Chapter22;

import java.util.Scanner;

public class Chapter22_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        if (isSubstring(str1, str2)) {
            System.out.println("matched at index " + str1.indexOf(str2));
        } else {
            System.out.println("is not a substring of " + str1.indexOf(str2));
        }
    }

    public static boolean isSubstring(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len2 > len1) {
            return false;
        }

        for (int i = 0; i <= len1 - len2; i++) {
            int j;
            for (j = 0; j < len2; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }
            if (j == len2) {
                return true;
            }
        }

        return false;
    }
}
