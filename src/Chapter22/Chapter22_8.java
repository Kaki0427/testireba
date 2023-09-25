package Chapter22;

import java.io.*;

public class Chapter22_8 {
    public static void main(String[] args) {
        long limit = 10_000_000_000L;
        String fileName = "PrimeNumbers.dat";


        try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
