package Chapter13;

public class Chapter13_11Test {
    public static void main(String[] args) {
        Chapter13_11 octagon1 = new Chapter13_11(5.0);
        Chapter13_11 octagon2 = octagon1.clone();

        System.out.println("Octagon 1:");
        System.out.println("Area: " + octagon1.getArea());
        System.out.println("Perimeter: " + octagon1.getPerimeter());

        System.out.println("\nOctagon 2 (Clone of Octagon 1):");
        System.out.println("Area: " + octagon2.getArea());
        System.out.println("Perimeter: " + octagon2.getPerimeter());

        int comparisonResult = octagon1.compareTo(octagon2);
        if (comparisonResult == 0) {
            System.out.println("\nOctagon 1 and Octagon 2 are equal.");
        } else if (comparisonResult < 0) {
            System.out.println("\nOctagon 1 is smaller than Octagon 2.");
        } else {
            System.out.println("\nOctagon 1 is larger than Octagon 2.");
        }
    }
}

