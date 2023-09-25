package Chapter23;

import java.util.Comparator;

public class Chapter23_4 {

    public static <E extends Comparable<E>> void quickSort(E[] list) {
        quickSort(list, 0, list.length - 1);
    }

    public static <E> void quickSort(E[] list, Comparator<? super E> comparator) {
        quickSort(list, 0, list.length - 1, comparator);
    }

    private static <E extends Comparable<E>> void quickSort(E[] list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private static <E> void quickSort(E[] list, int low, int high, Comparator<? super E> comparator) {
        if (low < high) {
            int pivotIndex = partition(list, low, high, comparator);
            quickSort(list, low, pivotIndex - 1, comparator);
            quickSort(list, pivotIndex + 1, high, comparator);
        }
    }

    private static <E> int partition(E[] list, int low, int high, Comparator<? super E> comparator) {
        return low;
    }

    private static <E extends Comparable<E>> int partition(E[] list, int low, int high) {
        int middle = (low + high) / 2;

        if (list[high].compareTo(list[low]) < 0) {
            swap(list, low, high);
        }

        if (list[middle].compareTo(list[low]) < 0) {
            swap(list, low, middle);
        }

        if (list[high].compareTo(list[middle]) < 0) {
            swap(list, middle, high);
        }

        E pivot = list[middle];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (list[i].compareTo(pivot) < 0);

            do {
                j--;
            } while (list[j].compareTo(pivot) > 0);

            if (i >= j) {
                return j;
            }

            swap(list, i, j);
        }
    }

    private static <E> void swap(E[] list, int i, int j) {
        E temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void main(String[] args) {
        // Example usage with Comparable
        Integer[] intArray = {5, 2, 9, 1, 5};
        quickSort(intArray);
        System.out.println("Sorted integers using Comparable:");
        for (Integer num : intArray) {
            System.out.print(num + " ");
        }

        // Example usage with Comparator
        String[] strArray = {"apple", "banana", "cherry", "date", "blueberry"};
        quickSort(strArray, String.CASE_INSENSITIVE_ORDER);
        System.out.println("\nSorted strings using Comparator (case-insensitive):");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}
