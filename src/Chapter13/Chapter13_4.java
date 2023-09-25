package Chapter13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Chapter13_4 {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2016, 4, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(new SimpleDateFormat("MMMM YYYY").format(calendar.getTime()));
        System.out.println(" S  M  T  W  T  F  S");

        String initialSpace = "";
        for (int i = 0; i < dayOfWeek - 1; i++) {
            initialSpace += "   ";
        }
        System.out.print(initialSpace);

        for (int i = 0, dayOfMonth = 1; dayOfMonth <= daysInMonth; i++) {
            for (int j = ((i == 0) ? dayOfWeek - 1 : 0); j < 7 && (dayOfMonth <= daysInMonth); j++) {
                System.out.printf("%2d ", dayOfMonth);
                dayOfMonth++;
            }
            System.out.println();
        }
    }
}