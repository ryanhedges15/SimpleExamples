package graphics;

import java.awt.*;
import javax.swing.*;

/**
 * Created by rmhedge on 9/1/17.
 */
public class CloudComponent extends JComponent {

        private Cloud cloud;

        public CloudComponent(int x, int y) {
            super();
            cloud = new Cloud(x,y);
            this.setVisible(true);
            this.setSize(this.getMaximumSize());
        }

        @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(Color.white);
            cloud.draw(g2);
        }
}
