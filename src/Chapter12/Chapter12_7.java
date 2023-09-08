package Chapter12;

public class Chapter12_7 {
    public static void main(String[] args) {
        try {
            System.out.println(bin2Dec("1101")); // Valid binary string
            System.out.println(bin2Dec("1020")); // Invalid binary string
        } catch (NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static int bin2Dec(String binaryString) {
        if (!isValidBinaryString(binaryString)) {
            throw new NumberFormatException("Invalid binary string: " + binaryString);
        }

        int decimalValue = 0;
        int length = binaryString.length();

        for (int i = 0; i < length; i++) {
            char binaryChar = binaryString.charAt(i);
            int digit = Character.getNumericValue(binaryChar);
            decimalValue += digit * Math.pow(2, length - i - 1);
        }

        return decimalValue;
    }

    public static boolean isValidBinaryString(String binaryString) {
        // Check if the string is not empty and consists of valid binary characters (0 or 1)
        return binaryString != null && !binaryString.isEmpty() && binaryString.matches("[01]+");
    }
}
