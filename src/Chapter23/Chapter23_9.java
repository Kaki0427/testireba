package Chapter23;

import java.util.ArrayList;
import java.util.Comparator;

public class Chapter23_9<E> {
    private ArrayList<E> list;
    private Comparator<? super E> comparator;

    public Chapter23_9() {
        list = new ArrayList<>();
    }

    public Chapter23_9(Comparator<? super E> comparator) {
        list = new ArrayList<>();
        this.comparator = comparator;
    }

    public void add(E value) {
        list.add(value);
        int currentIndex = list.size() - 1;

        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (comparator.compare(list.get(currentIndex), list.get(parentIndex)) > 0) {
                // Swap with the parent if the current element is greater
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
            } else {
                break; // The tree is a heap now
            }
            currentIndex = parentIndex;
        }
    }

    public E remove() {
        if (list.isEmpty()) {
            return null;
        }

        E removedValue = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while (currentIndex < list.size()) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

            if (leftChildIndex >= list.size()) {
                break; // The tree is a heap
            }

            int maxIndex = leftChildIndex;
            if (rightChildIndex < list.size() &&
                    comparator.compare(list.get(rightChildIndex), list.get(leftChildIndex)) > 0) {
                maxIndex = rightChildIndex;
            }

            if (comparator.compare(list.get(currentIndex), list.get(maxIndex)) < 0) {
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
                currentIndex = maxIndex;
            } else {
                break; // The tree is a heap
            }
        }

        return removedValue;
    }

    public int getSize() {
        return list.size();
    }

    public static void main(String[] args) {
        Chapter23_9<Integer> maxHeap = new Chapter23_9<>(Comparator.reverseOrder());
    }
}
