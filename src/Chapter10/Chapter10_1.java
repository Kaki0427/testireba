package Chapter10;

public class Chapter10_1 {
    private long hour;
    private long minute;
    private long second;

    public Chapter10_1() {
        long currentTimeMillis = System.currentTimeMillis();
        setTime(currentTimeMillis);
    }

    public Chapter10_1(long elapsedTime) {
        setTime(elapsedTime);
    }

    public Chapter10_1(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        this.second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        this.minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
    }

    public static void main(String[] args) {
        Chapter10_1 currentTime = new Chapter10_1();
        Chapter10_1 customTime = new Chapter10_1(555550000);

        System.out.println("Current Time: " + currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
        System.out.println("Custom Time: " + customTime.getHour() + ":" + customTime.getMinute() + ":" + customTime.getSecond());
    }
}
