import java.util.Scanner;
import java.util.Random;

public class Chapter3_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Scissor", "Rock", "Paper"};

        int computerChoice = random.nextInt(3);

        System.out.print("Enter your choice : ");
        int userChoice = scanner.nextInt();

        System.out.println("Computer chose " + choices[computerChoice]);
        System.out.println("You chose " + choices[userChoice]);

        if (userChoice == computerChoice) {
            System.out.println("It's a draw!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
