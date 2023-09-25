package Chapter20;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Chapter20_6{
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5000; i++) {
            linkedList.add(i);
        }

        long startTime = System.nanoTime();
        traverseWithIterator(linkedList);
        long endTime = System.nanoTime();
        long iteratorTime = endTime - startTime;

        startTime = System.nanoTime();
        traverseWithGet(linkedList);
        endTime = System.nanoTime();
        long getTime = endTime - startTime;

        System.out.println("Time taken to traverse using iterator: " + iteratorTime / 1e6 + " milliseconds");
        System.out.println("Time taken to traverse using get(index): " + getTime / 1e6 + " milliseconds");
    }

    public static void traverseWithIterator(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }

    public static void traverseWithGet(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }
}
