package Chapter13;

import java.util.Date;

abstract class Chapter13_1 {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected Chapter13_1() {
        color = "white";
        filled = false;
        dateCreated = new Date();
    }

    protected Chapter13_1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

class Triangle extends Chapter13_1 {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        return 0.0;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
