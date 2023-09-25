package Chapter23;

public class Chapter23_8 {
    public static <E extends Comparable<E>> void sort(E[] list) {

        for (int i = list.length / 2 - 1; i >= 0; i--) {
            heapify(list, list.length, i);
        }


        for (int i = list.length - 1; i >= 0; i--) {

            E temp = list[0];
            list[0] = list[i];
            list[i] = temp;


            heapify(list, i, 0);
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

    public static void main(String[] args) {
        Integer[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array:");
        printArray(arr);


        sort(arr);

        System.out.println("Sorted array in ascending order:");
        printArray(arr);
    }

    private static <E> void printArray(E[] arr) {
        for (E e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
