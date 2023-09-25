package Chapter21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chapter21_9 {
    public static void main(String[] args) {
        Map<String, String> stateCapitalMap = new HashMap<>();


        stateCapitalMap.put("Georgia", "Tbilisi");
        stateCapitalMap.put("Spain", "Madrid");
        stateCapitalMap.put("France", "Paris");
        stateCapitalMap.put("Germany", "Berlin");

        Scanner input = new Scanner(System.in);

        System.out.println("State Capital Matching Game");
        System.out.println("Enter 'exit' to quit.");

        int correctCount = 0;

        while (!stateCapitalMap.isEmpty()) {
            Object[] states = stateCapitalMap.keySet().toArray();
            String randomState = (String) states[(int) (Math.random() * states.length)];

            System.out.print("What is the capital of " + randomState + "? ");
            String userAnswer = input.nextLine().trim();

            if (userAnswer.equalsIgnoreCase("exit")) {
                break;
            }

            String actualCapital = stateCapitalMap.get(randomState);

            if (userAnswer.equalsIgnoreCase(actualCapital)) {
                System.out.println("Correct! The capital of " + randomState + " is " + actualCapital);
                stateCapitalMap.remove(randomState);
                correctCount++;
            } else {
                System.out.println("Incorrect. Try again.");
            }
        }

        System.out.println("Game over. You guessed " + correctCount + " capitals correctly.");
    }
}
