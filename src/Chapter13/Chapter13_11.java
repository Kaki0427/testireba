package Chapter13;

public class Chapter13_11 extends GeometricObject implements Comparable<Chapter13_11>, Cloneable {
    private double side;

    public Chapter13_11() {
        this.side = 1.0;
    }

    public Chapter13_11(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        try {
            return (2 + 4 * Math.sqrt(2)) * side * side;
        } catch (NullPointerException ex) {
            System.out.println("Error!");
        }
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Chapter13_11 o) {
        if (this.side < o.side) {
            return -1;
        } else if (this.side > o.side) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Chapter13_11 clone() {
        try {
            return (Chapter13_11) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Error!");
        }
        return null;
    }

    @Override
    public String toString() {
        return "Octagon with side " + side;
    }
}
