public class test {
    public static void main(String[] args) {
        double sum = 0 ,count=0;

        int[] numbers = {1, 4, 7, 2, 9, 6, 8};
        for (int i = 0 ; i < numbers.length; i+=2){
            sum += numbers[i];
            count++;
        }
        System.out.println(count);
        System.out.println(sum/count);
    }
}
