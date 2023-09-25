package Chapter24;

import java.util.Iterator;

public class PrimeIterator implements Iterator<Integer> {
    private int current;
    private int maxLimit;

    public PrimeIterator(int maxLimit) {
        this.maxLimit = maxLimit;
        this.current = 1;
    }

    @Override
    public boolean hasNext() {
        return current < maxLimit;
    }

    @Override
    public Integer next() {
        while (true) {
            current++;
            if (isPrime(current)) {
                return current;
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Optional: Implement the remove() method if needed, but it can be left unimplemented for this example.
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
