public class test3 {
    public static boolean digits(long number) {
        if (number < 0) {
            number = -number;
        }

        String numStr = Long.toString(number);

        for (int i = 0; i <= numStr.length() - 3; i++) {
            char digit1 = numStr.charAt(i);
            char digit2 = numStr.charAt(i + 1);
            char digit3 = numStr.charAt(i + 2);

            if (digit1 == digit2 && digit2 == digit3) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        long num = 123334567;
        boolean result = digits(num);
        if (result) {
            System.out.println("რიცხვი შეიცავს სამ ერთნაირ ციფრს.");
        } else {
            System.out.println("რიცხვი არ შეიცავს სამ ერთნაირ ციფრს.");
        }
    }
}
