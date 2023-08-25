import java.util.Scanner;

public class Chapter3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("The numbers in non-decreasing order are: " + num1 + " " + num2 + " " + num3);

    }
}
