package Chapter8;
class Main implements Series {
    int start;
    int val;
    Main() {
        start = 0;
        val = 0;
    }
    public int getNext() {
        val += 2;
        return val;
    }
    public void reset() {
        val = start;
    }
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
class SeriesDemo {
    public static void main(String args[]) {
        Main ob = new Main();
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " +
                    ob.getNext());
        System.out.println("\nResetting");
        ob.reset();
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " +ob.getNext());
        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " +
                    ob.getNext());
    }
}