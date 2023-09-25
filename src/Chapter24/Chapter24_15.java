package Chapter24;

public class Chapter24_15 {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        System.out.println("Adding elements to the list...");
        for (int i = 1; i <= 10; i++) {
            list.add(i * 10);
        }
        System.out.println("List size: " + list.size());

        System.out.println("\nRetrieving elements from the list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        System.out.println("\nUpdating elements in the list:");
        list.set(4, 999);
        list.set(8, 777);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        System.out.println("\nRemoving elements from the list:");
        list.remove(0);
        list.remove(6);
        list.remove(list.size() - 1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        System.out.println("\nIs the list empty? " + list.isEmpty());
        list.clear();
        System.out.println("Is the list empty after clearing? " + list.isEmpty());
    }
}
