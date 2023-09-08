package Chapter12;

public class Chapter12_5 {
    private double side1;
    private double side2;
    private double side3;

    public Chapter12_5(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException();
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

}
