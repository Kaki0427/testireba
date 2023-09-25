package Chapter21;

import java.util.LinkedHashSet;
import java.util.Set;

public class Chapter21_1 {
    public static void main(String[] args) {

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");


        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");


        Set<String> clonedSet1 = new LinkedHashSet<>(set1);
        Set<String> clonedSet2 = new LinkedHashSet<>(set2);


        Set<String> unionSet = new LinkedHashSet<>(clonedSet1);
        unionSet.addAll(clonedSet2);
        System.out.println("Union: " + unionSet);


        Set<String> differenceSet = new LinkedHashSet<>(clonedSet1);
        differenceSet.removeAll(clonedSet2);
        System.out.println("Difference (set1 - set2): " + differenceSet);


        Set<String> intersectionSet = new LinkedHashSet<>(clonedSet1);
        intersectionSet.retainAll(clonedSet2);
        System.out.println("Intersection: " + intersectionSet);
    }
}
