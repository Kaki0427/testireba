import java.util.Random;

public class Main2 {
    public  static void main(String[] args){
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 10;
        System.out.println(randomNumber);
    }
}
