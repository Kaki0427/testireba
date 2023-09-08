package Chapter12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Chapter12_19 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");

            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                wordCount += words.length;
            }

            reader.close();

            System.out.println("Number of words in Lincoln's Gettysburg Address: " + wordCount);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the speech: " + e.getMessage());
        }
    }
}

