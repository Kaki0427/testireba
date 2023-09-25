package Chapter18;

public class Chapter18_18 {
    private static int numberOfMoves = 0;

    public static void main(String[] args) {
        int n = 3;
        char fromTower = 'A';
        char toTower = 'B';
        char auxTower = 'C';

        moveDisks(n, fromTower, toTower, auxTower);

        System.out.println("Number of moves needed: " + numberOfMoves);
    }

    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            numberOfMoves++;
        } else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            numberOfMoves++;
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}
