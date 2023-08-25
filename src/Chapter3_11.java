import java.util.Scanner;

public class Chapter3_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        String monthName = getMonthName(month);
        System.out.println(monthName + " " + year + " had " + daysInMonth[month - 1] + " days.");

    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static String getMonthName(int month) {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }
}
