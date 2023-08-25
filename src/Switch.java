import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("აირჩიეთ სასურველი დღე: ");
        byte day = scanner.nextByte();

        switch (day){
            case 1:
                System.out.println("ორშაბათი");
                break;
            case 2:
                System.out.println("სამშაბათი");
                break;
            case 3:
                System.out.println("ოთხშაბათი");
                break;
            case 4:
                System.out.println("ხუთშაბათი");
                break;
            case 5:
                System.out.println("პარასკევი");
                break;
            case 6:
                System.out.println("შაბათი");
                break;
            case 7:
                System.out.println("კვირა");
                break;
            default:
                System.out.println("ახალ დღეს იგონებ?");
                break;
        }
    }
}
