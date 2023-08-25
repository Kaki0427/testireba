public class test5 {
    public static boolean isPalindrome(int n) {
    if (n < 0) {
        return false; //უარყოფითი რიცხვი არარის პალინდრომი
    }

    int originalNumber = n;
    int reversedNumber = 0;

    while (n > 0) {
        int digit = n % 10;
        reversedNumber = reversedNumber * 10 + digit;
        n /= 10;
    }

    return originalNumber == reversedNumber;
}

    public static void main(String[] args) {
        int number = 12321;
        boolean result = isPalindrome(number);

        if (result) {
            System.out.println(number + " პალინდრომია.");
        } else {
            System.out.println(number + " არარის პალინდრომი.");
        }
    }
}
