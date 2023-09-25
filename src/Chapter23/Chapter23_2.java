package Chapter23;

import java.util.Arrays;
import java.util.Comparator;

public class Chapter23_2 {

    public static <E extends Comparable<E>> void mergeSort(E[] list) {
        if (list.length > 1) {
            int mid = list.length / 2;
            E[] left = Arrays.copyOfRange(list, 0, mid);
            E[] right = Arrays.copyOfRange(list, mid, list.length);

            mergeSort(left);
            mergeSort(right);

            merge(list, left, right);
        }
    }

    public static <E> void mergeSort(E[] list, Comparator<? super E> comparator) {
        if (list.length > 1) {
            int mid = list.length / 2;
            E[] left = Arrays.copyOfRange(list, 0, mid);
            E[] right = Arrays.copyOfRange(list, mid, list.length);

            mergeSort(left, comparator);
            mergeSort(right, comparator);

            merge(list, left, right, comparator);
        }
    }

    private static <E extends Comparable<E>> void merge(E[] result, E[] left, E[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) < 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    private static <E> void merge(E[] result, E[] left, E[] right, Comparator<? super E> comparator) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (comparator.compare(left[i], right[j]) < 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    public static void main(String[] args) {

        Integer[] intArray = {5, 2, 9, 1, 5};
        mergeSort(intArray);
        System.out.println("Sorted integers using Comparable:");
        System.out.println(Arrays.toString(intArray));


        String[] strArray = {"apple", "banana", "cherry", "date", "blueberry"};
        mergeSort(strArray, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted strings using Comparator (case-insensitive):");
        System.out.println(Arrays.toString(strArray));
    }
}
