import java.util.Scanner;

public class Chapter2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        double volume = area * length;

        System.out.println("Cylinder Area: " + area);
        System.out.println("Cylinder Volume: " + volume);
    }
}
