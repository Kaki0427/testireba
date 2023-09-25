package Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread();
        MyThreadRunnable myth = new MyThreadRunnable(th, new int[]{1, 2, 3, 4});



    }

}
