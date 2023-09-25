package Chapter18;

public class Chapter18_5 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("i\tm(i)");
        for (int i = 1; i <= n; i++) {
            double result = computeSeries(i);
            System.out.println(i + "\t" + result);
        }
    }

    public static double computeSeries(int i) {
        if (i == 1) {
            return 1.0 / 3.0;
        } else {
            return computeSeries(i - 1) + (double)i / (2 * i + 1);
        }
    }
}
