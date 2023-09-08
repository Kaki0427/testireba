package Chapter10;

public class Chapter10_3 {
    private int value;

    public Chapter10_3(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(Chapter10_3 myInt) {
        return myInt.isEven();
    }

    public static boolean isOdd(Chapter10_3 myInt) {
        return myInt.isOdd();
    }

    public static boolean isPrime(Chapter10_3 myInt) {
        return myInt.isPrime();
    }

    public boolean equals(int num) {
        return value == num;
    }

    public boolean equals(Chapter10_3 myInt) {
        return value == myInt.getValue();
    }

    public static int parseInt(char[] chars) {
        String str = new String(chars);
        return Integer.parseInt(str);
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        Chapter10_3 myInt = new Chapter10_3(17);

        System.out.println("Value: " + myInt.getValue());
        System.out.println("Is Even? " + myInt.isEven());
        System.out.println("Is Odd? " + myInt.isOdd());
        System.out.println("Is Prime? " + myInt.isPrime());

        System.out.println("Is Even (static): " + Chapter10_3.isEven(8));
        System.out.println("Is Odd (static): " + Chapter10_3.isOdd(8));
        System.out.println("Is Prime (static): " + Chapter10_3.isPrime(11));

        System.out.println("Is Even (static with object): " + Chapter10_3.isEven(myInt));
        System.out.println("Is Odd (static with object): " + Chapter10_3.isOdd(myInt));
        System.out.println("Is Prime (static with object): " + Chapter10_3.isPrime(myInt));

        System.out.println("Equals (int): " + myInt.equals(17));
        System.out.println("Equals (object): " + myInt.equals(new Chapter10_3(17)));

        char[] numChars = {'1', '2', '3', '4', '5'};
        System.out.println("Parse Int (char[]): " + Chapter10_3.parseInt(numChars));

        String numStr = "9876";
        System.out.println("Parse Int (String): " + Chapter10_3.parseInt(numStr));
    }
}
