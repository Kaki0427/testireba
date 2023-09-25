package Chapter21;

import java.io.*;
import java.util.*;

class WordOccurrence2 implements Comparable<WordOccurrence2> {
    String word;
    int count;

    public WordOccurrence2(String word) {
        this.word = word;
        this.count = 1;
    }

    @Override
    public int compareTo(WordOccurrence2 other) {
        return this.word.compareToIgnoreCase(other.word);
    }
}

public class Chapter21_8 {
    public static void main(String[] args) {


        File file = new File("scores.txt");

        if (!file.exists()) {
            System.out.println("File not found.");
            System.exit(2);
        }

        Map<String, WordOccurrence2> wordMap = new TreeMap<>();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String line = input.nextLine();
                String[] words = line.split("[\\s,;.:?'\")(!]+");

                for (String word : words) {
                    if (word.matches("^[a-zA-Z].*")) {
                        String lowercaseWord = word.toLowerCase();
                        wordMap.compute(lowercaseWord, (key, oldValue) -> {
                            if (oldValue != null) {
                                oldValue.count++;
                                return oldValue;
                            } else {
                                return new WordOccurrence2(lowercaseWord);
                            }
                        });
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<WordOccurrence2> wordList = new ArrayList<>(wordMap.values());

        // Sort wordList in alphabetical order (case-insensitive)
        Collections.sort(wordList);

        // Display words and counts
        for (WordOccurrence2 w : wordList) {
            System.out.println(w.word + ": " + w.count);
        }
    }
}
