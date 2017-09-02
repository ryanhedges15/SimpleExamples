import graphics.CloudComponent;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rmhedge on 9/1/17.
 */
public class ShapeGui extends JFrame {

    private static JPanel panel;

    public static void main(String[] args) {
         init();
         CloudComponent component = new CloudComponent(200,200);
         CloudComponent component2 = new CloudComponent(500,500);
         CloudComponent component3 = new CloudComponent(600,100);

         panel.add(component);
         panel.add(component2);
         panel.add(component3);
         int i = 1;
         while (true) {
             panel.repaint();
             i++;
             try {

                 Thread.sleep(2000);
             }
             catch (InterruptedException e) {

             }
         }

    }

    private static void init() {
        JFrame frame = new JFrame("Just A Plane GUI");
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.decode("#1e6ded"));
        frame.add(panel);
        frame.setSize(1280, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
