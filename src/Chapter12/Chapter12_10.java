package Chapter12;

public class Chapter12_10 {
    public static void main(String[] args) {
        try {
            generateOutOfMemoryError();
        } catch (OutOfMemoryError e) {
            System.out.println("Caught an OutOfMemoryError!");
            e.printStackTrace();
        }
    }

    public static void generateOutOfMemoryError() {
        long[] array = new long[Integer.MAX_VALUE]; // Attempt to allocate a large array
    }
}
