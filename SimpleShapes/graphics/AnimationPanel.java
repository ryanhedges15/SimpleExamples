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
        Timer timer = new Timer(500,this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D)g.create();
        graphics2D.clearRect(0, 0, this.getWidth(), this.getHeight());
        graphics2D.setPaint(Color.WHITE);
        graphics2D.fillRect(0,0,this.getWidth(),this.getHeight());
        graphics2D.scale(4d,4d);
        graphics2D.drawImage(new QuestionCube().asImage(),100,75,this);

        if(frameNumber%8==1) {
            System.out.println("with coins");
            graphics2D.scale(.5, .5);
            graphics2D.drawImage(new Coin().asImage(), 110 * 2, 50 * 2, this);
            graphics2D.drawImage(new Coin().asImage(), 110 * 2, 30 * 2, this);
        }
        if(frameNumber%8==4) {
            System.out.println("with coins");
            graphics2D.scale(.5, .5);
            graphics2D.drawImage(new Coin().asImage(), 110 * 2, 30 * 2, this);
            graphics2D.drawImage(new Coin().asImage(), 110 * 2, 10 * 2, this);
        }
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println("Repainting");
        this.frameNumber++;
        this.repaint();
    }
}
