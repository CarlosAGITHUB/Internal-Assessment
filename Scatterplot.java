import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Scatterplot extends JFrame {
    private List points = new ArrayList();

    public Scatterplot() {
        super("Scatterplot");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Debug");
        points.add(new Point2D.Float(2, 4));
        points.add(new Point2D.Float(4, 6));
        points.add(new Point2D.Float(6, 8));
        points.add(new Point2D.Float(8, 10));
        points.add(new Point2D.Float(10, 12));

        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                for (Iterator i = points.iterator(); i.hasNext(); ) {
                    Point2D.Float pt = (Point2D.Float) i.next();
                    g.drawString("X", (int) pt.x, (int) pt.y);
                }
            }
        };
        //JLabel labelX = new JLabel(){
           //code
        //}
        //JLabel labelY = new JLabel(){

        //}

        setContentPane(panel);
        setBounds(20, 20, 200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        new Scatterplot();
    }
}
