package Chapter21;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Chapter21_2 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Java source file: ");
        String fileName = input.nextLine();
        File file = new File(fileName);
        Set<String> words = new TreeSet<>();
        if (!file.exists()) {
            System.out.println("Usage: java NonDuplicateWords <inputFileName>");
            System.exit(1);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {

                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {

                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    if (!word.isEmpty()) {
                        words.add(word);

                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            System.exit(2);
        }


        for (String word : words) {
            System.out.println(word);
        }
    }
}
