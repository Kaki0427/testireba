package Threads;

public class MyThreadRunnable implements Runnable{


    private Thread th;

    private int[] arr;


    public MyThreadRunnable(Thread th,int[] arr) {
        this.arr=arr;
        th.start();

    }

    @Override
    public void run() {
        Example ex = new Example();
        System.out.println(ex.arrSum(arr));
    }
}
