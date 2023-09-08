package Chapter12;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("Invalid triangle sides. The sum of any two sides must be greater than the third side.");
    }
}
