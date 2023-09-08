package Chapter10;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

    public static void main(String[] args) throws Exception {
        String inputFileName = "scores.txt";
        String outputFileName = "copyfile.txt";

        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);

        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        byte[] buffer = new byte[1024];

       int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            for (int i = 0; i < bytesRead; i++) {
                if (buffer[i] == ' ') {
                    buffer[i] = '-';
                }
            }
            fos.write(buffer, 0, bytesRead);
        }

        fis.close();
        fos.close();
    }
}
