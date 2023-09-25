package Chapter21;

import java.util.*;

public class Chapter21_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (0 to end input):");

        Map<Integer, Integer> numberCounts = new HashMap<>();
        int maxCount = 0;

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            int count = numberCounts.getOrDefault(number, 0) + 1;
            numberCounts.put(number, count);


            if (count > maxCount) {
                maxCount = count;
            }
        }


        System.out.print("The number(s) with the most occurrences: ");
        for (Map.Entry<Integer, Integer> entry : numberCounts.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.print(entry.getKey() + " ");
            }
        }

        scanner.close();
    }
}
