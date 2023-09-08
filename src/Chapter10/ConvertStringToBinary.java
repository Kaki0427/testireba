package Chapter10;

public class ConvertStringToBinary {

    public static String convertStringToBinary(String string) {
        String[] parts = string.split("\\.");
        String integerPart = parts[0];
        String decimalPart = parts[1];

        String binaryString = "";
        for (int i = integerPart.length() - 1; i >= 0; i--) {
            binaryString += integerPart.charAt(i) == '1' ? "1" : "0";
        }

        double decimal = Double.parseDouble(decimalPart);
        while (decimal > 0) {
            binaryString += decimal >= 0.5 ? "1" : "0";
            decimal = decimal * 2 - 1;
        }

        return binaryString;
    }

    public static void main(String[] args) {
        String string = "123.23";
        String binary = convertStringToBinary(string);
        System.out.println(binary);
    }
}
