public class Masivebi {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            if (isPerfectNumber(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}