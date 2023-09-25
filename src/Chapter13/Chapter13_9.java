package Chapter13;

public class Chapter13_9 extends GeometricObject implements Comparable<Chapter13_9> {
    private double radius;

    public Chapter13_9() {
    }

    public Chapter13_9(double radius) {
        this.radius = radius;
    }

    public Chapter13_9(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Chapter13_9 otherCircle) {
        if (this.radius < otherCircle.getRadius()) {
            return -1;
        } else if (this.radius > otherCircle.getRadius()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chapter13_9 circle = (Chapter13_9) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radius);
    }

}

