import java.util.Scanner;

public class Chapter3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        System.out.print("Enter feet: ");
        int feet = scanner.nextInt();

        System.out.print("Enter inches: ");
        int inches = scanner.nextInt();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        double heightInMeters = (feet * 12 + inches) * METERS_PER_INCH;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
}
