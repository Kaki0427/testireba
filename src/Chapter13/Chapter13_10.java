package Chapter13;

public class Chapter13_10 extends GeometricObject implements Comparable<Chapter13_10> {
    private double width;
    private double height;

    public Chapter13_10() {
    }

    public Chapter13_10(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Chapter13_10(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Chapter13_10 otherRectangle) {
        if (this.getArea() < otherRectangle.getArea()) {
            return -1;
        } else if (this.getArea() > otherRectangle.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chapter13_10 rectangle = (Chapter13_10) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(width) + Double.hashCode(height);
    }
}

