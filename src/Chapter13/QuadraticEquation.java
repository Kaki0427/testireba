package Chapter13;

import java.util.Scanner;

class Chapter13_20 {
    private double real;
    private double imaginary;

    public Chapter13_20() {
        real = 0;
        imaginary = 0;
    }

    public Chapter13_20(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Chapter13_20 add(Chapter13_20 complex) {
        return new Chapter13_20(real + complex.real, imaginary + complex.imaginary);
    }

    public Chapter13_20 subtract(Chapter13_20 complex) {
        return new Chapter13_20(real - complex.real, imaginary - complex.imaginary);
    }

    public Chapter13_20 multiply(Chapter13_20 complex) {
        double newReal = (real * complex.real) - (imaginary * complex.imaginary);
        double newImaginary = (real * complex.imaginary) + (imaginary * complex.real);
        return new Chapter13_20(newReal, newImaginary);
    }

    public Chapter13_20 divide(Chapter13_20 complex) {
        double divisor = (complex.real * complex.real) + (complex.imaginary * complex.imaginary);
        double newReal = ((real * complex.real) + (imaginary * complex.imaginary)) / divisor;
        double newImaginary = ((imaginary * complex.real) - (real * complex.imaginary)) / divisor;
        return new Chapter13_20(newReal, newImaginary);
    }

    public double abs() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }

    public void sqrt() {
    }
}

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        Chapter13_20 discriminant = new Chapter13_20(b * b - 4 * a * c, 0);
        Chapter13_20 root1, root2;

        if (discriminant.abs() < 1e-9) {
            // One real root
            root1 = new Chapter13_20(-b / (2 * a), 0);
            root2 = root1;
        } else if (discriminant.abs() >= 1e-9) {
            // Two complex roots
            Chapter13_20 rPart = new Chapter13_20(-b / (2 * a), 0);
            Chapter13_20 dPart = discriminant.divide(new Chapter13_20(2 * a, 0));

            root1 = rPart.add(dPart);
            root2 = rPart.subtract(dPart);
        } else {
            // Two real roots
            double r1 = (-b + Math.sqrt(discriminant.abs())) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant.abs())) / (2 * a);
            root1 = new Chapter13_20(r1, 0);
            root2 = new Chapter13_20(r2, 0);
        }

        System.out.println("The roots are " + root1 + " and " + root2);
    }
}
