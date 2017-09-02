package graphics;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rmhedge on 9/2/17.
 */
public class AnimationPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D)g.create();
        g.drawImage(new QuestionCube().asImage(),100,100,this);

    }
}
