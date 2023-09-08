package Chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Chapter12_24 {
    public static void main(String[] args) {
        String[] ranks = {"assistant", "associate", "full"};
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("Salary.txt")))) {
            for (int i = 1; i <= 1000; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                String rank = ranks[random.nextInt(3)];

                double salary;
                switch (rank) {
                    case "assistant":
                        salary = 50000 + random.nextDouble() * 30000;
                        break;
                    case "associate":
                        salary = 60000 + random.nextDouble() * 50000;
                        break;
                    case "full":
                        salary = 75000 + random.nextDouble() * 55000;
                        break;
                    default:
                        salary = 0.0;
                }

                writer.printf("%s %s %s %.2f%n", firstName, lastName, rank, salary);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Data file Salary.txt created successfully.");
    }
}
