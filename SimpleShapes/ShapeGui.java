import graphics.AnimationPanel;
import graphics.PixelMap;
import graphics.QuestionCube;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by rmhedge on 9/1/17.
 */
public class ShapeGui extends JFrame {

    private static JPanel panel;
    private static JFrame frame;

    public static void main(String[] args) {
        init();
        panel.setVisible(true);
        panel.repaint();
    }


    private static void init() {
        frame = new JFrame("Just A Plane GUI");
        panel = new AnimationPanel();
        frame.setContentPane(panel);
        panel.setBackground(Color.white);
        frame.pack();
        frame.setResizable(false);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize((int) screen.getWidth(), (int) screen.getHeight());
        frame.setLocation((screen.width - frame.getWidth()) / 2, (screen.height - frame.getHeight()) / 2);
        frame.setVisible(true);
    }




}
