import java.util.Scanner;

public class Chapter3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficients: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double m1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double m2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two real roots: " + m1 + " and " + m2);
        } else if (discriminant == 0) {
            double m = -b / (2 * a);
            System.out.println("The equation has one real root: " + m);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
