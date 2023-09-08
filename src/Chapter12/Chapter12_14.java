package Chapter12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Chapter12_14 {
    public static void main(String[] args) {
        File file = new File("scores.txt");
        if (!file.exists()) {
            System.out.println("Usage: java ProcessScoresFromFile <filename>");
            System.exit(1);
        }

        String fileName = "scores.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int total = 0;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                String[] scores = line.split("\\s+");
                for (String score : scores) {
                    try {
                        int value = Integer.parseInt(score);
                        total += value;
                        count++;
                    } catch (NumberFormatException e) {
                        System.err.println("Ignoring non-numeric value: " + score);
                    }
                }
            }

            if (count > 0) {
                double average = (double) total / count;
                System.out.println("Total: " + total);
                System.out.println("Average: " + average);
            } else {
                System.out.println("No valid scores found in the file.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
