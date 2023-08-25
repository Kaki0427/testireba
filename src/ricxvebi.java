import java.util.Scanner;

public class ricxvebi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ პირველი რიცხვი: ");
        int firstNumber = scanner.nextInt();

        int sum = 0;
        for (int i = 0 ; i < firstNumber ; i++){
            for (int divisors = 1 ; divisors < i ; divisors++) {
                if (i % divisors == 0) {
                    sum += divisors;
                }
                if (sum == i){
                    System.out.println("მეგობრული რიცხვებია: " + i);
                }
            }
        }

        System.out.println(sum);
    }
}