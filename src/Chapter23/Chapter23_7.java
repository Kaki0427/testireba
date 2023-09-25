package Chapter23;

import java.util.ArrayList;

public class Chapter23_7<E extends Comparable<E>> {
    private ArrayList<E> list = new ArrayList<>();

    public Chapter23_7() {
    }

    public Chapter23_7(E[] objects) {
        for (E object : objects) {
            add(object);
        }
    }

    public void add(E newObject) {
        list.add(newObject);
        int currentIndex = list.size() - 1;

        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;

            if (list.get(currentIndex).compareTo(list.get(parentIndex)) < 0) {
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
            } else {
                break;
            }

            currentIndex = parentIndex;
        }
    }

    public E remove() {
        if (list.isEmpty()) {
            return null;
        }

        E removedObject = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while (currentIndex < list.size()) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

            if (leftChildIndex >= list.size()) {
                break;
            }

            int minIndex = leftChildIndex;
            if (rightChildIndex < list.size() &&
                    list.get(rightChildIndex).compareTo(list.get(leftChildIndex)) < 0) {
                minIndex = rightChildIndex;
            }

            if (list.get(currentIndex).compareTo(list.get(minIndex)) > 0) {
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(minIndex));
                list.set(minIndex, temp);
                currentIndex = minIndex;
            } else {
                break;
            }
        }

        return removedObject;
    }

    public int getSize() {
        return list.size();
    }

    public static void main(String[] args) {
        Chapter23_7<Integer> minHeap = new Chapter23_7<>();
        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(8);
        minHeap.add(1);

        System.out.println(minHeap.remove());
        System.out.println(minHeap.remove());

    }
}
