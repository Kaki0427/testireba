import java.util.Scanner;

public class saatebi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        System.out.println("Divisors of " + number + " are:");
        for (int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }

        }
        System.out.println(sum);
    }
}
