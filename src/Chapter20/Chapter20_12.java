package Chapter20;

import java.util.PriorityQueue;
import java.util.Iterator;

public class Chapter20_12<E> extends PriorityQueue<E> implements Cloneable {

    public Chapter20_12() {
        super();
    }

    public Chapter20_12(int initialCapacity) {
        super(initialCapacity);
    }

    public Chapter20_12(int initialCapacity, java.util.Comparator<? super E> comparator) {
        super(initialCapacity, comparator);
    }

    // Custom clone method that returns a deep copy of the priority queue
    @Override
    public Chapter20_12<E> clone() {
        Chapter20_12<E> clonedQueue = new Chapter20_12<>(size(), comparator());

       Iterator<E> iterator = iterator();
        while (iterator.hasNext()) {
            clonedQueue.add(iterator.next());
        }

        return clonedQueue;
    }


    public static void main(String[] args) {
        Chapter20_12<Integer> originalQueue = new Chapter20_12<>();
        originalQueue.add(3);
        originalQueue.add(1);
        originalQueue.add(2);

        Chapter20_12<Integer> clonedQueue = originalQueue.clone();

        System.out.println("Original Queue: " + originalQueue);
        System.out.println("Cloned Queue: " + clonedQueue);

        originalQueue.poll();
        System.out.println("Original Queue after poll: " + originalQueue);
        System.out.println("Cloned Queue after modifying original: " + clonedQueue);
    }
}
