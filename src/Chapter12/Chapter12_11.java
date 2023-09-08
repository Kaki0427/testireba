package Chapter12;

import java.io.*;
import java.util.Scanner;


public class Chapter12_11 {

    public static void main(String[] args) {
        File file = new File("scores.txt");
        if (!file.exists()) {
            System.out.println("Usage: java Exercise12_11 word filename");
            System.exit(1);
        }

        String filename = "scores.txt";
        String removalString = "Kakha";
        String newString = "";

        StringBuffer sb = new StringBuffer();
        try (Scanner in = new Scanner(new File(filename));) {
            while (in.hasNext()) {
                String line = in.nextLine();
                if (line.contains(removalString)) {
                    line = line.replaceAll(removalString, newString);
                    sb.append(line);
                } else {
                    sb.append(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        System.out.println(sb.toString());
    }
}
