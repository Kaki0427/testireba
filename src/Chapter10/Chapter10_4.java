package Chapter10;

public class Chapter10_4 {
    private double x;
    private double y;

    public Chapter10_4() {
        this(0, 0);
    }

    public Chapter10_4(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Chapter10_4 point) {
        double deltaX = this.x - point.x;
        double deltaY = this.y - point.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double distance(double x, double y) {
        double deltaX = this.x - x;
        double deltaY = this.y - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static void main(String[] args) {
        Chapter10_4 point1 = new Chapter10_4();
        Chapter10_4 point2 = new Chapter10_4(10, 30.5);

        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
        System.out.println("Distance between Point 1 and Point 2: " + point1.distance(point2));
    }
}
