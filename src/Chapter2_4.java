import java.util.Scanner;

public class Chapter2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double POUNDS_TO_KILOGRAMS = 0.454;

        System.out.print("Enter a weight in pounds: ");
        double pounds = scanner.nextDouble();

        double kilograms = pounds * POUNDS_TO_KILOGRAMS;

        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
    }
}