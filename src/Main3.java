import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("რა რაოდენობის დოლარის გადაცვვლა გსურთ?: ");
        double money = scanner.nextDouble();

        System.out.println("აირჩიეთ ვალუტა:");
        System.out.println("1. ევრო");
        System.out.println("2. ლარი");
        System.out.println("3. გირვანქა სტერლინგი");

        int choice = scanner.nextInt();

        double transfer = 0.0;

        switch (choice) {
            case 1:
                transfer = money * 0.91;
                break;
            case 2:
                transfer = money * 2.6;
                break;
            case 3:
                transfer = money * 0.79;
                break;
            default:
                System.out.println("ჩეპეა რაცხა.");
                scanner.close();
                return;
        }

        System.out.println("გადახურდავებული თანხა: " + transfer);
        scanner.close();
    }
}