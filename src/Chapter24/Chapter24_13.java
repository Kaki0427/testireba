package Chapter24;

public class Chapter24_13 {
    public static void main(String[] args) {
        int limit = 100000;
        FibonacciIterator iterator = new FibonacciIterator(limit);

        System.out.println("Fibonacci numbers less than or equal to " + limit + ":");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
