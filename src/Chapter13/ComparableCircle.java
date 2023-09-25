package Chapter13;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    // Constructors
    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        double thisArea = getArea();
        double otherArea = o.getArea();

        if (thisArea < otherArea) {
            return -1;
        } else if (thisArea > otherArea) {
            return 1;
        } else {
            return 0;
        }
    }

}
