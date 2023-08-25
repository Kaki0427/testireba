import java.util.Scanner;

public class Chapter3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients a, b, c, d, e, and f:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        double determinant = a * d - b * c;

        if (determinant == 0) {
            System.out.println("The equation has no solution.");
        } else {
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;

            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
