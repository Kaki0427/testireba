import java.util.Scanner;

public class Chapter2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 1000) {
            System.out.println("Invalid input. The number must be between 0 and 1000.");
        } else {
            int sum = 0;
            int originalNumber = number;

            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            System.out.println("The sum of digits in " + originalNumber + " is " + sum);
        }
    }
}
