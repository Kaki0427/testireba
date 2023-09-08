package Chapter12;

import java.util.Random;
import java.util.Scanner;

public class Chapter12_3 {
    public static void main(String[] args) {

        int[] randomArray = new int[100];
        Random rand = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(1000);
        }


        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index: ");

        try {
            int index = input.nextInt();

            if (index >= 0 && index < randomArray.length) {
                int value = randomArray[index];
                System.out.println("Value at index " + index + ": " + value);
            } else {
                System.out.println("Out of Bounds");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer index.");
        }
    }
}
