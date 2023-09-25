package Chapter24;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int current;
    private int next;
    private int maxLimit;

    public FibonacciIterator(int maxLimit) {
        this.maxLimit = maxLimit;
        this.current = 0;
        this.next = 1;
    }

    @Override
    public boolean hasNext() {
        return current + next <= maxLimit;
    }

    @Override
    public Integer next() {
        int result = current;
        int temp = next;
        next = current + next;
        current = temp;
        return result;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
