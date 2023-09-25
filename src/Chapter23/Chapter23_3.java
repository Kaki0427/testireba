package Chapter23;

import java.util.Comparator;

public class Chapter23_3 {

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

    private static <E extends Comparable<E>> int partition(E[] list, int low, int high) {
        E pivot = list[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= j && list[i].compareTo(pivot) <= 0) {
                i++;
            }

            while (i <= j && list[j].compareTo(pivot) > 0) {
                j--;
            }

            if (i < j) {
                E temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        while (j > low && list[j].compareTo(pivot) >= 0) {
            j--;
        }

        if (pivot.compareTo(list[j]) > 0) {
            list[low] = list[j];
            list[j] = pivot;
            return j;
        } else {
            return low;
        }
    }

    private static <E> int partition(E[] list, int low, int high, Comparator<? super E> comparator) {
        E pivot = list[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= j && comparator.compare(list[i], pivot) <= 0) {
                i++;
            }

            while (i <= j && comparator.compare(list[j], pivot) > 0) {
                j--;
            }

            if (i < j) {
                E temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        while (j > low && comparator.compare(list[j], pivot) >= 0) {
            j--;
        }

        if (comparator.compare(pivot, list[j]) > 0) {
            list[low] = list[j];
            list[j] = pivot;
            return j;
        } else {
            return low;
        }
    }

    public static void main(String[] args) {

        Integer[] intArray = {5, 2, 9, 1, 5};
        quickSort(intArray);
        System.out.println("Sorted integers using Comparable:");
        for (Integer num : intArray) {
            System.out.print(num + " ");
        }


        String[] strArray = {"apple", "banana", "cherry", "date", "blueberry"};
        quickSort(strArray, String.CASE_INSENSITIVE_ORDER);
        System.out.println("\nSorted strings using Comparator (case-insensitive):");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}
