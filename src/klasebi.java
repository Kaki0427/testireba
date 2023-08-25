public class klasebi {
    public static void main(String[] args) {
        int r = d(3,6,2);
        if (r < 0 ){
            System.out.println("ar aqvs amonaxsni");
        }else if ( r == 0){
            System.out.println("aqvs erti amonaxsni");
        }else{
            System.out.println("aqvs ori amonaxsni");
        }
    }
    public static void gilocav(String Name,int age){
    }
    static int sum (int a, int b){
        int c = a + b;
        return a + b;
    }

    static int d(int a, int b , int c){
        int result = b*b - 4*a*c;
        return result;
    }
}
