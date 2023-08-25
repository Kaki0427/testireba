import java.util.Scanner;

public class Chapter2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subtotal: $");
        double subtotal = scanner.nextDouble();

        System.out.print("Enter the gratuity rate (as a percentage): ");
        double gratuityRate = scanner.nextDouble();

        double gratuity = (gratuityRate / 100) * subtotal;
        double total = subtotal + gratuity;

        System.out.println("Gratuity: $" + gratuity);
        System.out.println("Total: $" + total);

    }
}
