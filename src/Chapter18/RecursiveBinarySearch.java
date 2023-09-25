package Chapter18;

public class RecursiveBinarySearch {
    public static int RecursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return RecursiveBinarySearch(list, key, low, high);
        }

         private static int RecursiveBinarySearch(int[] list, int key, int low, int high) {
        if (low > high) // The list has been exhausted without a match
            return -low - 1;
        int mid = (low + high) / 2;
        if (key < list[mid])
            return RecursiveBinarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
            return mid;
        else
        return RecursiveBinarySearch(list, key, mid + 1, high);
        }
}