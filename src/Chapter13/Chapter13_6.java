package Chapter13;

public class Chapter13_6 {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(10);

        ComparableCircle largerCircle = (ComparableCircle) GeometricObject.max(circle1, circle2);

        if (largerCircle == circle1) {
            System.out.println("Circle 1 is larger.");
        } else if (largerCircle == circle2) {
            System.out.println("Circle 2 is larger.");
        } else {
            System.out.println("Both circles are equal in size.");
        }
    }
}
