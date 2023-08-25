import java.util.Scanner;

public class Chapter3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.print("Enter today's day: ");
        int today = scanner.nextInt();

        System.out.print("Enter the number of days after today: ");
        int daysAfter = scanner.nextInt();

        int futureDayIndex = (today + daysAfter) % 7;
        String futureDayName = daysOfWeek[futureDayIndex];

        System.out.println("Today is " + daysOfWeek[today] + " and the future day is " + futureDayName);

    }
}
