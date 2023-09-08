package Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chapter12_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a filename: ");
        String fileName = scanner.nextLine();

        Map<Character, Integer> letterOccurrences = new HashMap<>();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        c = Character.toLowerCase(c);
                        letterOccurrences.put(c, letterOccurrences.getOrDefault(c, 0) + 1);
                    }
                }
            }

            fileScanner.close();

            for (char c = 'a'; c <= 'z'; c++) {
                int count = letterOccurrences.getOrDefault(c, 0);
                if (count > 0) {
                    System.out.println("Number of " + c + "'s: " + count);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        scanner.close();
    }
}
