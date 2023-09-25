package Chapter13;

import java.util.Scanner;

public class Chapter13_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter  a, b, c: ");
        double x = 0,y;
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double h = -b / (2.0 * a);
        double k = a * h * h + b * h + c;
        y = (a * x * x)+(b*x)+c;
        y = (a*Math.pow(x-h,2))+k;
        System.out.println("h is " + h + " k is " + k);
    }
}

