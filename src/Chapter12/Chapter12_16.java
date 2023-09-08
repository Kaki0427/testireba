package Chapter12;

import java.io.*;
import java.util.Scanner;

public class Chapter12_16 {
    public static void main(String[] args) {
        File file = new File("scores.txt");
        if (!file.exists()) {
            System.out.println("Usage: java ReplaceText file oldString newString");
            System.exit(1);
        }

        String filename = "scores.txt";
        String oldString = "John";
        String newString = "Kakha";

        StringBuilder modifiedContent = new StringBuilder();

        try (Scanner input = new Scanner(new File(filename))) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                line = line.replaceAll(oldString, newString);
                modifiedContent.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            System.exit(2);
        }

        try (PrintWriter output = new PrintWriter(new File(filename))) {
            output.print(modifiedContent.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + filename);
            System.exit(3);
        }

        System.out.println("Replacement complete.");
    }
}

