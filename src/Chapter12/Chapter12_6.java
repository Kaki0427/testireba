package Chapter12;

public class Chapter12_6 {
    public static void main(String[] args) {
        try {
            System.out.println(hex2Dec("1A")); // Valid hexadecimal string
            System.out.println(hex2Dec("G12")); // Invalid hexadecimal string
        } catch (NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static int hex2Dec(String hexString) {
        if (!isValidHexString(hexString)) {
            throw new NumberFormatException("Invalid hexadecimal string: " + hexString);
        }

        int decimalValue = 0;
        for (int i = 0; i < hexString.length(); i++) {
            char hexChar = hexString.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char hexChar) {
        if (hexChar >= 'A' && hexChar <= 'F') {
            return 10 + hexChar - 'A';
        } else if (hexChar >= '0' && hexChar <= '9') {
            return hexChar - '0';
        } else {
            throw new NumberFormatException("Invalid hexadecimal character: " + hexChar);
        }
    }

    public static boolean isValidHexString(String hexString) {
        // Check if the string is not empty and consists of valid hexadecimal characters
        return hexString != null && !hexString.isEmpty() && hexString.matches("[0-9A-Fa-f]+");
    }
}
