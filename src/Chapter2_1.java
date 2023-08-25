import java.util.Scanner;

public class Chapter2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
