import java.util.Scanner;

public class Chapter3_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the first rice package in pounds: ");
        double weight1 = scanner.nextDouble();
        System.out.print("Enter the price of the first rice package: $");
        double price1 = scanner.nextDouble();

        System.out.print("Enter the weight of the second rice package in pounds: ");
        double weight2 = scanner.nextDouble();
        System.out.print("Enter the price of the second rice package: $");
        double price2 = scanner.nextDouble();

        double costPerPound1 = price1 / weight1;
        double costPerPound2 = price2 / weight2;

        String betterPackage;
        if (costPerPound1 < costPerPound2) {
            betterPackage = "the first package";
        } else if (costPerPound1 > costPerPound2) {
            betterPackage = "the second package";
        } else {
            betterPackage = "both packages";
        }

        System.out.println("The better price is in " + betterPackage);

    }
}
