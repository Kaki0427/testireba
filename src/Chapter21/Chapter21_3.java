package Chapter21;

import java.io.*;
import java.util.*;

public class Chapter21_3 {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        System.out.print("Enter a Java source file: ");
        String filename = add.nextLine();
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("File " + file + " does not exist.");
            System.exit(1);
        }

        Set<String> keywordSet = new HashSet<>(Arrays.asList(
                "abstract", "assert", "boolean", "break", "byte", "case", "catch",
                "char", "class", "const", "continue", "default", "do", "double",
                "else", "enum", "extends", "false", "final", "finally", "float",
                "for", "if", "implements", "import", "instanceof", "int", "interface",
                "long", "native", "new", "null", "package", "private", "protected",
                "public", "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true", "try",
                "void", "volatile", "while"
        ));

        int keywordCount = 0;
        boolean inComment = false;
        String currentLine;

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                currentLine = input.nextLine().trim();
                if (!inComment) {
                    if (currentLine.startsWith("/*")) {
                        inComment = true;
                        if (!currentLine.endsWith("*/")) {
                            continue;
                        }
                    } else if (currentLine.contains("/*")) {
                        inComment = true;
                    } else if (currentLine.contains("*/")) {
                        inComment = false;
                    }

                    if (!inComment) {
                        if (currentLine.contains("//")) {
                            currentLine = currentLine.split("//")[0];
                        }


                        String[] words = currentLine.split("\\s+");


                        for (String word : words) {
                            if (keywordSet.contains(word)) {
                                keywordCount++;
                            }
                        }
                    }
                } else if (currentLine.endsWith("*/")) {
                    inComment = false;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            System.exit(3);
        }

        System.out.println("Total keyword count (excluding comments and strings): " + keywordCount);
    }
}
