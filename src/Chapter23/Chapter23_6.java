package Chapter23;

import java.util.Comparator;

public class Chapter23_6 {


    public static boolean ordered(int[] list) {
        return ordered(list, true);
    }


    public static boolean ordered(int[] list, boolean ascending) {
        int n = list.length;

        if (ascending) {
            for (int i = 0; i < n - 1; i++) {
                if (list[i] > list[i + 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (list[i] < list[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean ordered(double[] list) {
        return ordered(list, true);
    }


    public static boolean ordered(double[] list, boolean ascending) {
        int n = list.length;

        if (ascending) {
            for (int i = 0; i < n - 1; i++) {
                if (list[i] > list[i + 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (list[i] < list[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static <E extends Comparable<E>> boolean ordered(E[] list) {
        return ordered(list, true);
    }


    public static <E extends Comparable<E>> boolean ordered(E[] list, boolean ascending) {
        int n = list.length;

        if (ascending) {
            for (int i = 0; i < n - 1; i++) {
                if (list[i].compareTo(list[i + 1]) > 0) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (list[i].compareTo(list[i + 1]) < 0) {
                    return false;
                }
            }
        }
        return true;
    }

   public static <E> boolean ordered(E[] list, Comparator<? super E> comparator) {
        return ordered(list, comparator, true);
    }

   public static <E> boolean ordered(E[] list, Comparator<? super E> comparator, boolean ascending) {
        int n = list.length;

        if (ascending) {
            for (int i = 0; i < n - 1; i++) {
                if (comparator.compare(list[i], list[i + 1]) > 0) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (comparator.compare(list[i], list[i + 1]) < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};

        System.out.println("Is arr1 ordered in ascending order? " + ordered(arr1, true));
        System.out.println("Is arr2 ordered in ascending order? " + ordered(arr2, true));
        System.out.println("Is arr2 ordered in descending order? " + ordered(arr2, false));

        Double[] doubleArr1 = {1.0, 2.0, 3.0, 4.0, 5.0};
        Double[] doubleArr2 = {5.0, 4.0, 3.0, 2.0, 1.0};

        System.out.println("Is doubleArr1 ordered in ascending order? " + ordered(doubleArr1, true));
        System.out.println("Is doubleArr2 ordered in ascending order? " + ordered(doubleArr2, true));
        System.out.println("Is doubleArr2 ordered in descending order? " + ordered(doubleArr2, false));

        String[] strArr1 = {"apple", "banana", "cherry"};
        String[] strArr2 = {"cherry", "banana", "apple"};

        System.out.println("Is strArr1 ordered in ascending order? " + ordered(strArr1, true));
        System.out.println("Is strArr2 ordered in ascending order? " + ordered(strArr2, true));
        System.out.println("Is strArr2 ordered in descending order? " + ordered(strArr2, false));
    }
}
