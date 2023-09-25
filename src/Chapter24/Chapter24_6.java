package Chapter24;

public class Chapter24_6 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        pq.enqueue(3);
        pq.enqueue(1);
        pq.enqueue(5);
        pq.enqueue(2);

        System.out.println("PriorityQueue: " + pq);
        System.out.println("Dequeue: " + pq.dequeue());
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Size: " + pq.getSize());
    }
}
