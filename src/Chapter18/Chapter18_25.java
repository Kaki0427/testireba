package Chapter18;

import java.util.Scanner;

public class Chapter18_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();

        System.out.println("Permutations of the string:");
        displayPermutation(str);
    }

    public static void displayPermutation(String s) {
        displayPermutation("", s);
    }

    public static void displayPermutation(String s1, String s2) {
        if (s2.length() == 0) {
            System.out.println(s1);
        } else {
            for (int i = 0; i < s2.length(); i++) {
                char ch = s2.charAt(i);
                String newS1 = s1 + ch;
                String newS2 = s2.substring(0, i) + s2.substring(i + 1);
                displayPermutation(newS1, newS2);
            }
        }
    }
}
