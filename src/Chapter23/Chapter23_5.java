package Chapter23;

import java.util.Comparator;

public class Chapter23_5{

    public static <E extends Comparable<E>> void heapSort(E[] list) {
        int n = list.length;


        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }


        for (int i = n - 1; i >= 0; i--) {

            E temp = list[0];
            list[0] = list[i];
            list[i] = temp;


            heapify(list, i, 0);
        }
    }

    public static <E> void heapSort(E[] list, Comparator<? super E> comparator) {
        int n = list.length;


        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i, comparator);
        }


        for (int i = n - 1; i >= 0; i--) {

            E temp = list[0];
            list[0] = list[i];
            list[i] = temp;


            heapify(list, i, 0, comparator);
        }
    }

    private static <E extends Comparable<E>> void heapify(E[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left].compareTo(arr[largest]) > 0) {
            largest = left;
        }

        if (right < n && arr[right].compareTo(arr[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            E swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    private static <E> void heapify(E[] arr, int n, int i, Comparator<? super E> comparator) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && comparator.compare(arr[left], arr[largest]) > 0) {
            largest = left;
        }

        if (right < n && comparator.compare(arr[right], arr[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            E swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest, comparator);
        }
    }

    public static void main(String[] args) {

        Integer[] intArray = {5, 2, 9, 1, 5};
        heapSort(intArray);
        System.out.println("Sorted integers using Comparable:");
        for (Integer num : intArray) {
            System.out.print(num + " ");
        }


        String[] strArray = {"apple", "banana", "cherry", "date", "blueberry"};
        heapSort(strArray, String.CASE_INSENSITIVE_ORDER);
        System.out.println("\nSorted strings using Comparator (case-insensitive):");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}
