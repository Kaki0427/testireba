package Chapter10;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

    public static void main(String[] args) throws Exception {
        File file = new File("scores.txt");

        RandomAccessFile raf = new RandomAccessFile(file, "rw");

        raf.seek(0);

        int b;
        while ((b = raf.read()) != -1) {
            System.out.println((char) b);
        }

        raf.close();
    }
}
