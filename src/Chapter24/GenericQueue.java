package Chapter24;

import java.util.LinkedList;

public class GenericQueue<E> extends LinkedList<E> {
    // Add an element to the queue
    public void enqueue(E e) {
        this.addLast(e); // Add to the end of the list
    }

    // Remove and return an element from the queue
    public E dequeue() {
        if (isEmpty()) {
            return null; // Queue is empty
        }
        return this.removeFirst(); // Remove from the front of the list
    }

    // Get the number of elements in the queue
    public int getSize() {
        return super.size();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return super.isEmpty();
    }

    // Override the toString method to provide a custom string representation
    @Override
    public String toString() {
        return "Queue: " + super.toString();
    }

    // You can add more methods or customizations as needed
}
