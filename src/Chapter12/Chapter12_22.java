package Chapter12;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class Chapter12_22 {
    public static void main(String[] args) {
        File file = new File("scores.txt");
        if (!file.exists()) {
            System.out.println("Usage: java ReplaceTextInFiles dirPath oldString newString");
            System.exit(1);
        }

        String directoryPath = "scores.txt";
        String oldString = "T";
        String newString = "Samkharadze";

        try {
            Path directory = Paths.get(directoryPath);

            Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path filePath, BasicFileAttributes attrs) throws IOException {
                    if (Files.isRegularFile(filePath)) {
                        List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);

                        for (int i = 0; i < lines.size(); i++) {
                            String line = lines.get(i);
                            line = line.replace(oldString, newString);
                            lines.set(i, line);
                        }

                        Files.write(filePath, lines, StandardCharsets.UTF_8);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });

            System.out.println("Text replacement completed successfully.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

