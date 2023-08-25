import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}