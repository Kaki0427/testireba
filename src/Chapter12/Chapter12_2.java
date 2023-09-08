package Chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter12_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        while (true) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = input.nextInt();

                System.out.print("Enter the second integer: ");
                num2 = input.nextInt();

                int sum = num1 + num2;
                System.out.println("Sum: " + sum);


                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter two integers.");

                input.nextLine();
            }
        }
    }
}
