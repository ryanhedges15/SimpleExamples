package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

/**
 * Created by rmhedge on 9/2/17.
 */
public class AnimationPanel extends JPanel implements ActionListener {

    private int frameNumber = 0;

    public AnimationPanel() {
        this.setBackground(Color.white);
        Timer timer = new Timer(500, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g.create();

        int currFrame = frameNumber % 4;
        if (currFrame >= 0) {
            graphics2D.translate(5, 7);
        }
        if (currFrame >= 1) {
            graphics2D.rotate(-1 * 60 * Math.PI / 180.0);
        }
        if (currFrame >= 2) {
            graphics2D.rotate(90 * Math.PI / 180.0);
        }
        if (currFrame >= 3) {
            graphics2D.scale(2, .5);
        }

        graphics2D.clearRect(0, 0, this.getWidth(), this.getHeight());
        graphics2D.setPaint(Color.WHITE);
        graphics2D.fillRect(0, 0, this.getWidth(), this.getHeight());
        graphics2D.drawImage(new QuestionCube().asImage(), 300, 250, this);

        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawImage(new Coin().asImage(), 110 * 2, 50 * 2, this);
        graphics2D.drawImage(new Coin().asImage(), 110 * 2, 35 * 2, this);

    }

    public void actionPerformed(ActionEvent event) {
        System.out.println("Repainting");
        this.frameNumber++;
        this.repaint();
    }
}
