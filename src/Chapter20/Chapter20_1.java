package Chapter20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter20_1 {
    public static void main(String[] args) {
        String inputFileName = "scores.txt";
        File file = new File(inputFileName);
        if (!file.exists()) {
            System.err.println("Usage: java WordSorter <inputFileName>");
            System.exit(1);
        }

        List<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words based on whitespace
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    // Remove non-letter characters and convert to lowercase
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    if (!word.isEmpty()) {
                        words.add(word);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            System.exit(1);
        }

        // Sort the words alphabetically
        Collections.sort(words);

        // Display the sorted words
        for (String word : words) {
            System.out.println(word);
        }
    }
}
