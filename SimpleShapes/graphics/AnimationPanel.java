package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rmhedge on 9/2/17.
 */
public class AnimationPanel extends JPanel implements ActionListener {

    private int frameNumber = 0;
    float pixelSize;

    public AnimationPanel() {
        this.setBackground(Color.white);
        Timer timer = new Timer(1000, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g.create();
        AffineTransform old = graphics2D.getTransform();

        graphics2D.setPaint(Color.WHITE);
        graphics2D.fillRect(0, 0, this.getWidth(), this.getHeight());


        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        applyWindowToViewportTranformation(graphics2D,-75,75,-75,75,true);
        int currFrame = frameNumber % 5;
        if (currFrame >= 1) {
            graphics2D.translate(-5, 7);

        }
        if (currFrame >= 2) {
            graphics2D.rotate(Math.toRadians(45));

        }
        if (currFrame >= 3) {
            graphics2D.rotate(Math.toRadians(-90));
        }
        if (currFrame >= 4) {
            graphics2D.scale(2, .5);
        }

        //graphics2D.translate(25,-25);
        graphics2D.drawImage(new Coin().asImage(),0,0,this);

        graphics2D.translate(-30,-30);
        graphics2D.drawImage(new Coin().asImage(),0,0,this);

        graphics2D.setTransform(old);

    }

    public void actionPerformed(ActionEvent event) {
        System.out.println("Repainting");
        this.frameNumber++;
        this.repaint();
    }

    private void applyWindowToViewportTranformation(Graphics2D graphics2D,double left, double right,double bottom,double top,boolean retainAspect){
        int width = super.getWidth();
        int height = super.getHeight();
        if(retainAspect) {
            double displayAspect = Math.abs((double)height/width);
            double requestedAspect = Math.abs((bottom-top)/(right-left));
            if(displayAspect>requestedAspect) {
                double excess = (bottom-top)*(displayAspect/requestedAspect-1);
                bottom+=excess/2;
                top-=excess/2;
            }
            else if(displayAspect<requestedAspect) {
                double excess = (right-left)*(requestedAspect/displayAspect-1);
                right+=excess/2;
                left-=excess/2;
            }
        }
        graphics2D.scale(width/(right-left),height/(bottom-top));
        graphics2D.translate(-left,-top);
        double pixelWidth = Math.abs((right-left)/width);
        double pixelHeight = Math.abs((bottom-top)/height);
        pixelSize = (float)Math.max(pixelWidth,pixelHeight);
    }

}
