import java.util.Scanner;

public class Chapter2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double FEET_TO_METERS = 0.305;

        System.out.print("Enter a length in feet: ");
        double feet = scanner.nextDouble();

        double meters = feet * FEET_TO_METERS;

        System.out.println(feet + " feet is equal to " + meters + " meters.");

    }
}
