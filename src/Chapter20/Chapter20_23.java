package Chapter20;
import java.util.*;

public class Chapter20_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expression = input.nextLine();

        try {
            expression = expression.replaceAll("\\^", "**");

            ExpressionEvaluator evaluator = new ExpressionEvaluator(expression);

            double result = evaluator.evaluateExpression();

            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
