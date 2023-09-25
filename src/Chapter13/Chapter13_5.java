package Chapter13;

public class Chapter13_5 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);

        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(6, 7);

        Circle largerCircle = (Circle) GeometricObject.max(circle1, circle2);
        System.out.println("The larger circle has radius: " + largerCircle.getRadius());

        Rectangle largerRectangle = (Rectangle) GeometricObject.max(rectangle1, rectangle2);
        System.out.println("The larger rectangle has dimensions: " + largerRectangle.getWidth()
                + "x" + largerRectangle.getHeight());
    }
}