import java.util.Scanner;

public class Chapter3_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lengths of three edges: ");
        double edge1 = scanner.nextDouble();
        double edge2 = scanner.nextDouble();
        double edge3 = scanner.nextDouble();

        if (isValidTriangle(edge1, edge2, edge3)) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter of the triangle is: " + perimeter);
        } else {
            System.out.println("The input is invalid. The sum of any two sides must be greater than the third side.");
        }

    }
    public static boolean isValidTriangle(double edge1, double edge2, double edge3) {
        return (edge1 + edge2 > edge3) && (edge2 + edge3 > edge1) && (edge3 + edge1 > edge2);
    }
}
