package Chapter18;

public class Chapter18_13 {
    public static void main(String[] args) {
        int[] numbers = new int[8];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter 8 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        input.close();

        int largest = findLargest(numbers, numbers.length - 1);
        System.out.println("The largest number is: " + largest);
    }

    public static int findLargest(int[] array, int index) {
        if (index == 0) {
            return array[0];
        } else {
            int maxInRest = findLargest(array, index - 1);
            return Math.max(maxInRest, array[index]);
        }
    }
}

