package Chapter18;
import javax.swing.*;
import java.awt.*;

public class SierpinskiGasket extends JFrame {

    Point x=new Point(5,545),
            y=new Point(300,25),
            z=new Point(605,545),
            current=x, target;
    private int count=0;

    public SierpinskiGasket () {
        super("Sierpinski Gasket");
        setSize(610,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        if(count==0) {
            g.drawLine(x.x,x.y,y.x,y.y);
            g.drawLine(x.x,x.y,z.x,z.y);
            g.drawLine(z.x,z.y,y.x,y.y);
        } else {
            while(count<10000) {
                int choice=(int)(Math.random()*3);
                switch(choice) {
                    case 0: target=x; break;
                    case 1: target=y; break;
                    case 2: target=z; break;
                    default: System.exit(0);
                }
                current=midpoint(current,target);
                g.drawRect(current.x,current.y,5,5);
                repaint();
                count++;
            }
        }
        count++;
    }

    public Point midpoint(Point a, Point b) {
        return new Point((Math.round(a.x+b.x)/2),
                (Math.round(a.y+b.y)/2));
    }

    public static void main(String[] args) {
        new SierpinskiGasket();
    }
}