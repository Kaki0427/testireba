package Chapter10;

public class Chapter10_11 {
    private double x;
    private double y;
    private double radius;

    public Chapter10_11() {
        this(0, 0, 1);
    }

    public Chapter10_11(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {

        return x;
    }

    public double getY() {

        return y;
    }

    public double getRadius() {

        return radius;
    }

    public double getArea() {

        return Math.PI * radius * radius;
    }

    public double getPerimeter() {

        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distance <= radius;
    }

    public boolean contains(Chapter10_11 circle) {
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return (distance + circle.radius) <= radius;
    }

    public boolean overlaps(Chapter10_11 circle) {
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distance < (radius + circle.radius);
    }
}
