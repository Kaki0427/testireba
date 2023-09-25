package Chapter21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Chapter21_4 {
    public static void main(String[] args) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int vowelCount = 0;
        int consonantCount = 0;


        String fileName = "scores.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int charCode;
            while ((charCode = reader.read()) != -1) {
                char ch = Character.toUpperCase((char) charCode);
                if (Character.isLetter(ch)) {
                    if (vowels.contains(ch)) {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }

            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
