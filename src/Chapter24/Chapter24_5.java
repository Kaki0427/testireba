package Chapter24;

public class Chapter24_5 {
    public static void main(String[] args) {
        GenericQueue<String> queue = new GenericQueue<>();

        queue.enqueue("Alice");
        queue.enqueue("Bob");
        queue.enqueue("Charlie");

        System.out.println("Queue: " + queue);
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Queue: " + queue);
        System.out.println("Size: " + queue.getSize());
    }
}
