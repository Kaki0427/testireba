package Chapter24;

public class Chapter24_4{
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        int count = 0;
        int number = 2;

        while (count < 50) {
            if (isPrime(number)) {
                stack.push(number);
                count++;
            }
            number++;
        }

        System.out.println("The first 50 prime numbers in descending order:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
