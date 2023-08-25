import java.util.Random;

public class Chapter3_24 {
    public static void main(String[] args) {
        Random random = new Random();

        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        int rankIndex = random.nextInt(ranks.length);
        int suitIndex = random.nextInt(suits.length);

        System.out.println("You picked the " + ranks[rankIndex] + " of " + suits[suitIndex]);
    }
}
