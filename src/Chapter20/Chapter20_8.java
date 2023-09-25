package Chapter20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chapter20_8 {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 1000);
        int lotteryOriginal = lottery;

        ArrayList<Integer> lotteryDigits = new ArrayList<>();
        while (lottery > 0) {
            lotteryDigits.add(lottery % 10);
            lottery /= 10;
        }
        Collections.sort(lotteryDigits);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        ArrayList<Integer> guessDigits = new ArrayList<>();
        int guessOriginal = guess;
        while (guess > 0) {
            guessDigits.add(guess % 10);
            guess /= 10;
        }
        Collections.sort(guessDigits);

        System.out.println("The lottery number is " + lotteryOriginal);

        if (guessOriginal == lotteryOriginal) {
            System.out.println("Congratulations! You win $10,000!");
        } else if (lotteryDigits.containsAll(guessDigits) && lotteryDigits.size() >= 2) {
            System.out.println("Congratulations! You win $2,000!");
        } else {
            System.out.println("Sorry, no match.");
        }
    }
}
