package Chapter12;

import java.util.Scanner;

public class Chapter12_1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        double operand1 = 0;
        double operand2 = 0;

        try {
            operand1 = input.nextDouble();
            String operator = input.next();
            operand2 = input.nextDouble();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Non-numeric operand detected.");
            System.exit(1);
        }

        double result = 0;

        switch (input.next()) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.exit(1);
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Error: Invalid operator.");
                System.exit(1);
        }

        System.out.println("Result: " + result);
    }
}
