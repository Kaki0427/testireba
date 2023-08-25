import java.util.Scanner;

public class Chapter3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN-10: ");
        int firstNineDigits = scanner.nextInt();

        int checksum = 0;
        int remainingDigits = firstNineDigits;

        for (int i = 9; i >= 1; i--) {
            int digit = remainingDigits % 10;
            checksum += digit * i;
            remainingDigits /= 10;
        }

        checksum %= 11;

        char lastDigit;
        if (checksum == 10) {
            lastDigit = 'X';
        } else {
            lastDigit = (char) (checksum + '0');
        }

        System.out.println("The 10-digit ISBN is: " + String.format("%09d", firstNineDigits) + lastDigit);

    }
}
