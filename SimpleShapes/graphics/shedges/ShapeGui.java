package graphics.shedges;

import javax.swing.*;
import java.awt.*;

public class ShapeGui extends JFrame {

    private static JPanel panel;
    private static JFrame frame;

    public static void main(String[] args) {
        init();
        panel.setVisible(true);
        panel.repaint();
    }


    private static void init() {
        frame = new JFrame("Graphics");
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
