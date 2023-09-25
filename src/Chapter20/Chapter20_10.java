package Chapter20;

import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;

public class Chapter20_10 {
    public static void main(String[] args) {

        PriorityQueue<String> queue1 = new PriorityQueue<>();
        PriorityQueue<String> queue2 = new PriorityQueue<>();


        queue1.add("George");
        queue1.add("Jim");
        queue1.add("John");
        queue1.add("Blake");
        queue1.add("Kevin");
        queue1.add("Michael");


        queue2.add("George");
        queue2.add("Katie");
        queue2.add("Kevin");
        queue2.add("Michelle");
        queue2.add("Ryan");

        PriorityQueue<String> union = new PriorityQueue<>(queue1);
        union.addAll(queue2);

        PriorityQueue<String> difference = new PriorityQueue<>(queue1);
        difference.removeAll(queue2);

        Set<String> set1 = new HashSet<>(queue1);
        Set<String> set2 = new HashSet<>(queue2);
        set1.retainAll(set2);
        PriorityQueue<String> intersection = new PriorityQueue<>(set1);

        System.out.println("Union: " + union);
        System.out.println("Difference: " + difference);
        System.out.println("Intersection: " + intersection);
    }
}
