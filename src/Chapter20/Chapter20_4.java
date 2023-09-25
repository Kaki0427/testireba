package Chapter20;

import java.util.*;

class Point implements Comparable<Point> {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public int compareTo(Point other) {
        if (this.x != other.x) {
            return Double.compare(this.x, other.x);
        } else {
            return Double.compare(this.y, other.y);
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.getY() != p2.getY()) {
            return Double.compare(p1.getY(), p2.getY());
        } else {
            return Double.compare(p1.getX(), p2.getX());
        }
    }
}

public class Chapter20_4 {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            double x = random.nextDouble() * 100;
            double y = random.nextDouble() * 100;
            points.add(new Point(x, y));
        }

        Collections.sort(points);

        System.out.println("Points sorted by x-coordinates:");
        for (Point point : points) {
            System.out.println(point);
        }

        Collections.sort(points, new CompareY());

        System.out.println("\nPoints sorted by y-coordinates:");
        for (Point point : points) {
            System.out.println(point);
        }
    }
}
