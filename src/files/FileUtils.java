package files;

import java.io.*;
import java.util.Scanner;

public class FileUtils {
    private final static String FILE_NAME = "myfile.txt";
    private final static File FILE = new File(FILE_NAME);

    private FileUtils(){

    }

    public static void createFile(){
        File file = new File(FILE_NAME);
        if (!file.exists()){
            try{
            if (file.createNewFile()){
                System.out.println("File has been created" + file.getName());
            }else{
                System.out.println("Error!");
            }
        }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("File already exists");
        }
        System.out.println("Updated!");
    }

    public static void write(String str){
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME,true);
            fileWriter.write(str);
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public static void readFile() {
        try {
            Scanner scanner = new Scanner(FILE);
            while (scanner.hasNext()){
                String str = scanner.nextLine();
                System.out.println(str);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
public static void deleteFile(){
       if  (FILE.delete()){
           System.out.println("Success");
       }  else {
           System.out.println();
       }
    }
    public static void maxNum(){
        try {
            Scanner fileScanner = new Scanner(FILE);
            int count[] = {3,1,5,6,1,23,1,5,6,1};
            int maxNumber = Integer.MIN_VALUE;

            for (int i = 0; i < count.length; i++) {
                int number = fileScanner.nextInt();
                if (number > maxNumber) {
                    maxNumber = number;
                }
            }

            PrintWriter fileWriter = new PrintWriter(FILE);
            fileWriter.println(maxNumber);
            fileWriter.close();
            System.out.println("Max Num Is" + maxNumber);
        }catch (IOException e){
            System.out.println("Error!" + e.getMessage());
        }

    }
}
