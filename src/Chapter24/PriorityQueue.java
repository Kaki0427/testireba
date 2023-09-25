package Chapter24;

import java.util.Comparator;
import java.util.LinkedList;

public class PriorityQueue<E> {
    private LinkedList<E> list = new LinkedList<>();
    private Comparator<? super E> comparator;

    // Construct a priority queue with a specified comparator
    public PriorityQueue(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    // Add an element to the priority queue
    public void enqueue(E e) {
        if (isEmpty()) {
            list.add(e);
        } else {
            int index = 0;
            while (index < list.size() && comparator.compare(e, list.get(index)) >= 0) {
                index++;
            }
            list.add(index, e);
        }
    }

    // Remove and return the highest priority element from the queue
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        return list.removeFirst();
    }

    // Get the number of elements in the queue
    public int getSize() {
        return list.size();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Override the toString method to provide a custom string representation
    @Override
    public String toString() {
        return "PriorityQueue: " + list.toString();
    }

    // You can add more methods or customizations as needed
}
