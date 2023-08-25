import java.util.Scanner;

public class saatebi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current hour (0-11): ");
        int currentHour = scanner.nextInt();

        System.out.print("Enter the current minute (0-59): ");
        int currentMinute = scanner.nextInt();

        int hours = currentHour;
        int minutes = currentMinute;

        // Loop to check angles
        while (true) {
            double hourHandAngle = 30 * hours + 0.5 * minutes; // The hour hand moves 0.5 degrees per minute
            double minuteHandAngle = 6 * minutes;

            double angle = Math.abs(hourHandAngle - minuteHandAngle);
            if (angle == 90) {
                System.out.println("The angles will be equal to 90 degrees at " + hours + " hours and " + minutes + " minutes.");
                break;
            }

            // Increment minutes and hours
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 12) {
                    hours = 0;
                }
            }
        }

        scanner.close();
    }
}
