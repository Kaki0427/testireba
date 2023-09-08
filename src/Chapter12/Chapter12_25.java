package Chapter12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Chapter12_25{
    public static void main(String[] args) {
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            Map<String, Double> rankToTotalSalary = new HashMap<>();
            Map<String, Integer> rankToFacultyCount = new HashMap<>();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 4) {
                    String rank = parts[2];
                    double salary = Double.parseDouble(parts[3]);

                    rankToTotalSalary.put(rank, rankToTotalSalary.getOrDefault(rank, 0.0) + salary);
                    rankToFacultyCount.put(rank, rankToFacultyCount.getOrDefault(rank, 0) + 1);
                }
            }

            System.out.println("Total and Average Salaries:");
            for (String rank : rankToTotalSalary.keySet()) {
                double totalSalary = rankToTotalSalary.get(rank);
                int facultyCount = rankToFacultyCount.get(rank);
                double averageSalary = totalSalary / facultyCount;

                System.out.println(rank + " Professor:");
                System.out.println("Total Salary: $" + totalSalary);
                System.out.println("Average Salary: $" + averageSalary);
                System.out.println();
            }

            double overallTotalSalary = rankToTotalSalary.values().stream().mapToDouble(Double::doubleValue).sum();
            int overallFacultyCount = rankToFacultyCount.values().stream().mapToInt(Integer::intValue).sum();
            double overallAverageSalary = overallTotalSalary / overallFacultyCount;

            System.out.println("Overall Statistics:");
            System.out.println("Total Salary for All Faculty: $" + overallTotalSalary);
            System.out.println("Average Salary for All Faculty: $" + overallAverageSalary);

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

