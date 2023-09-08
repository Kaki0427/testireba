package Chapter10;

public class Chapter10_11_2 {
    public static void main(String[] args) {
        Chapter10_11 c1 = new Chapter10_11(0, 0, 5);
        Chapter10_11 c2 = new Chapter10_11(0, 0, 2);
        Chapter10_11 c3 = new Chapter10_11(3, 3, 2);

        System.out.println("c1 Area: " + c1.getArea());
        System.out.println("c1 Perimeter: " + c1.getPerimeter());
        System.out.println("c1 contains point (1, 1): " + c1.contains(1, 1));
        System.out.println("c1 contains circle c2: " + c1.contains(c2));
        System.out.println("c1 overlaps with circle c3: " + c1.overlaps(c3));
    }
}
