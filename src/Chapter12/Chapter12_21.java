package Chapter12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Chapter12_21 {
    public static void main(String[] args) {
        String filename = "scores.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            ArrayList<String> strings = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                strings.add(line);
            }

            boolean sorted = true;
            String firstOutOfOrder = null;
            String secondOutOfOrder = null;

            for (int i = 0; i < strings.size() - 1; i++) {
                if (strings.get(i).compareTo(strings.get(i + 1)) > 0) {
                    sorted = false;
                    firstOutOfOrder = strings.get(i);
                    secondOutOfOrder = strings.get(i + 1);
                    break;
                }
            }

            if (sorted) {
                System.out.println("The strings in the file are in increasing order.");
            } else {
                System.out.println("The strings in the file are not in increasing order.");
                System.out.println("First out-of-order string: " + firstOutOfOrder);
                System.out.println("Second out-of-order string: " + secondOutOfOrder);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
