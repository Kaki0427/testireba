package Chapter24;

public class Chapter24_1 {
    public static void main(String[] args) {
        MyList<String> list1 = new MyArrayList<>();
        list1.add("Tom");
        list1.add("George");
        list1.add("Peter");
        list1.add("Jean");
        list1.add("Jane");

        MyList<String> list2 = new MyArrayList<>();
        list2.add("Tom");
        list2.add("George");
        list2.add("Michael");
        list2.add("Michelle");
        list2.add("Daniel");

        // Invoke addAll, removeAll, and retainAll methods
        System.out.println("list1.addAll(list2): " + list1.addAll(list2));
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        list1.clear();
        list2.clear();
        list1.add("Tom");
        list1.add("George");
        list1.add("Peter");
        list1.add("Jean");
        list1.add("Jane");
        list2.add("Tom");
        list2.add("George");
        list2.add("Michael");
        list2.add("Michelle");
        list2.add("Daniel");

        System.out.println("list1.removeAll(list2): " + list1.removeAll(list2));
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        list1.clear();
        list2.clear();
        list1.add("Tom");
        list1.add("George");
        list1.add("Peter");
        list1.add("Jean");
        list1.add("Jane");
        list2.add("Tom");
        list2.add("George");
        list2.add("Michael");
        list2.add("Michelle");
        list2.add("Daniel");

        System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
    }
}
