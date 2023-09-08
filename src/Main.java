public class Main {
    public static void main(String[] args) {

        try {
            int [] array = {1,2,3};
            System.out.println(array[10]);
            System.out.println(10/1);
            Main2 fraction = null;
            fraction.toString();
        }catch (ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index exception");
        }


        System.out.println("After");

    }
}