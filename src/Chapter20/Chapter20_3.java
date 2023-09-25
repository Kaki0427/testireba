package Chapter20;

import java.util.*;

public class Chapter20_3 {
    public static void main(String[] args) {
        List<CapitalPair> pairs = new ArrayList<>();
        pairs.add(new CapitalPair("Alabama", "Montgomery"));
        pairs.add(new CapitalPair("Alaska", "Juneau"));
        pairs.add(new CapitalPair("Arizona", "Phoenix"));
        pairs.add(new CapitalPair("Arkansas", "Little Rock"));


        Collections.shuffle(pairs);

        Scanner input = new Scanner(System.in);
        int correctCount = 0;

        for (CapitalPair pair : pairs) {
            System.out.print("What is the capital of " + pair.getState() + "? ");
            String userAnswer = input.nextLine();

            if (userAnswer.equalsIgnoreCase(pair.getCapital())) {
                System.out.println("Your answer is correct!\n");
                correctCount++;
            } else {
                System.out.println("The correct answer should be " + pair.getCapital() + ".\n");
            }
        }

        System.out.println("You got " + correctCount + " out of " + pairs.size() + " correct.");
    }
}

class CapitalPair {
    private String state;
    private String capital;

    public CapitalPair(String state, String capital) {
        this.state = state;
        this.capital = capital;
    }

    public String getState() {
        return state;
    }

    public String getCapital() {
        return capital;
    }
}
