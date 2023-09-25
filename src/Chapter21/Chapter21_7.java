package Chapter21;

import java.util.*;

class WordOccurrence implements Comparable<WordOccurrence2> {
    String word;
    int count;

    public WordOccurrence(String word) {
        this.word = word;
        this.count = 1;
    }

    @Override
    public int compareTo(WordOccurrence2 other) {

        return Integer.compare(this.count, other.count);
    }
}

public class Chapter21_7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = input.nextLine();


        String[] words = text.split("[\\s+\\p{Punct}]");
        ArrayList<WordOccurrence2> wordList = new ArrayList<>();

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();

            if (!lowercaseWord.isEmpty()) {
                boolean found = false;

                for (WordOccurrence2 w : wordList) {
                    if (w.word.equals(lowercaseWord)) {
                        w.count++;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    wordList.add(new WordOccurrence2(lowercaseWord));
                }
            }
        }


        Collections.sort(wordList);


        for (WordOccurrence2 w : wordList) {
            System.out.println(w.word + ": " + w.count);
        }
    }
}
