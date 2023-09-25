package Chapter20;

import java.util.Stack;

public class Chapter20_16 {

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    private static int getPrecedence(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1;
        }
    }

    public static String infixToPostfix(String expression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (char token : expression.toCharArray()) {
            if (Character.isDigit(token)) {

                postfix.append(token);
                postfix.append(' ');
            } else if (token == '(') {
                operatorStack.push(token);
            } else if (token == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop());
                    postfix.append(' ');
                }
                operatorStack.pop();
            } else if (isOperator(token)) {
                while (!operatorStack.isEmpty() && getPrecedence(token) <= getPrecedence(operatorStack.peek())) {
                    postfix.append(operatorStack.pop());
                    postfix.append(' ');
                }
                operatorStack.push(token);
            }
        }

        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
            postfix.append(' ');
        }

        return postfix.toString().trim();
    }

    public static void main(String[] args) {
        String infixExpression1 = "(1 + 2) * 3";
        String infixExpression2 = "2 * (1 + 3)";

        String postfix1 = infixToPostfix(infixExpression1);
        String postfix2 = infixToPostfix(infixExpression2);

        System.out.println("Infix 1: " + infixExpression1);
        System.out.println("Postfix 1: " + postfix1);

        System.out.println("Infix 2: " + infixExpression2);
        System.out.println("Postfix 2: " + postfix2);
    }
}
