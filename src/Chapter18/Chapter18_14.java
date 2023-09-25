package Chapter18;

public class Chapter18_14 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();

        int count = countUppercaseLetters(str);
        System.out.println("The number of uppercase letters in the string is: " + count);
    }

    public static int countUppercaseLetters(String str) {
        return countUppercaseLetters(str, str.length() - 1);
    }

    private static int countUppercaseLetters(String str, int index) {
        if (index < 0) {
            return 0;
        }

        char currentChar = str.charAt(index);
        if (Character.isUpperCase(currentChar)) {
            return 1 + countUppercaseLetters(str, index - 1);
        } else {
            return countUppercaseLetters(str, index - 1);
        }
    }
}
