package Chapter12;

import java.io.*;
import java.util.*;

public class Chapter12_15 {
    public static void main(String[] args) {

        File file = new File("Exercise12_15.txt");

        if (!file.exists()) {
            try {
                PrintWriter output = new PrintWriter(file);

                for (int i = 0; i < 100; i++) {
                    int randomInt = (int) (Math.random() * 1000);
                    output.print(randomInt + " ");
                }

                output.close();
            } catch (FileNotFoundException e) {
                System.err.println("Error: " + e.getMessage());
                return;
            }
        }

        ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextInt()) {
                int number = input.nextInt();
                numbers.add(number);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }

        Collections.sort(numbers);

        System.out.println("Data in increasing order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

