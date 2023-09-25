package Chapter23;

import java.util.Comparator;

public class Chapter23_1 {

    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i].compareTo(list[i + 1]) > 0) {
                    // Swap list[i] and list[i + 1]
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (comparator.compare(list[i], list[i + 1]) > 0) {

                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {

        Integer[] intArray = {5, 2, 9, 1, 5};
        bubbleSort(intArray);
        System.out.println("Sorted integers using Comparable:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        String[] strArray = {"apple", "banana", "cherry", "date", "blueberry"};
        bubbleSort(strArray, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted strings using Comparator (case-insensitive):");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}
