package Chapter24;

public class Chapter24_14 {
    public static void main(String[] args) {
        int limit = 100000;
        PrimeIterator iterator = new PrimeIterator(limit);

        System.out.println("Prime numbers less than or equal to " + limit + ":");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
