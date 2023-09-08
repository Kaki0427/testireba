package Chapter12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Chapter12_13 {
    public static void main(String[] args) {
        File file = new File("scores.txt");
        if (!file.exists()) {
            System.out.println("Usage: java CountFileContents <filename>");
            System.exit(1);
        }

        String fileName = "scores.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            String line;

            while ((line = reader.readLine()) != null) {
                charCount += line.length();
                wordCount += line.split("\\s+").length;
                lineCount++;
            }

            System.out.println("Character count: " + charCount);
            System.out.println("Word count: " + wordCount);
            System.out.println("Line count: " + lineCount);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

