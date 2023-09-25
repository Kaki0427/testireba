package Chapter13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter13_2 {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        numbers.add(12);
        numbers.add(13);
        numbers.add(20);
        numbers.add(27);

        shuffle(numbers);

        System.out.println("Shuffled ArrayList: " + numbers);
    }

    public static void shuffle(ArrayList<Number> list) {
        List<Number> tempList = new ArrayList<>(list);
        Collections.shuffle(tempList);

        list.clear();
        list.addAll(tempList);
    }
}
