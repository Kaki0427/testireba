package Chapter12;

import java.io.File;
import java.util.Scanner;

public class Chapter12_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the directory name: ");
        String directoryName = scanner.nextLine();

        File directory = new File(directoryName);

        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Directory already exists");
        } else {
            boolean created = directory.mkdirs();

            if (created) {
                System.out.println("Directory created successfully");
            } else {
                System.out.println("Failed to create directory");
            }
        }

        scanner.close();
    }
}
