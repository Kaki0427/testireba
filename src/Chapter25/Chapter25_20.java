package Chapter25;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter25_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of objects: ");
        int totalObjects = scanner.nextInt();

        System.out.println("Enter the weight of each object:");
        ArrayList<Integer> objects = new ArrayList<>();
        for (int i = 0; i < totalObjects; i++) {
            int weight = scanner.nextInt();
            objects.add(weight);
        }

        final int containerCapacity = 10;
        ArrayList<ArrayList<Integer>> containers = new ArrayList<>();
        int containerCount = 0;

        for (Integer object : objects) {
            boolean placed = false;
            for (int i = 0; i < containerCount; i++) {
                ArrayList<Integer> container = containers.get(i);
                int currentWeight = container.stream().mapToInt(Integer::intValue).sum();

                if (currentWeight + object <= containerCapacity) {
                    container.add(object);
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                ArrayList<Integer> newContainer = new ArrayList<>();
                newContainer.add(object);
                containers.add(newContainer);
                containerCount++;
            }
        }

        // Display the results
        System.out.println("Total number of containers needed: " + containerCount);
        for (int i = 0; i < containerCount; i++) {
            System.out.println("Container " + (i + 1) + " contains objects with weights: " + containers.get(i));
        }
    }
}
