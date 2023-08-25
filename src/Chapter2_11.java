import java.util.Scanner;

public class Chapter2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long currentPopulation = 312032486;

        long secondsPerYear = 365 * 24 * 60 * 60;

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        long projectedPopulation = currentPopulation + years * (secondsPerYear / 7 - secondsPerYear / 13 + secondsPerYear / 45);

        System.out.println("The population in " + years + " years is approximately " + projectedPopulation);

    }
}
