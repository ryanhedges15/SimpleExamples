package graphics;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by rmhedge on 9/1/17.
 */
public class Cloud {

        private int x, y;

        /**
         * Constructs a cloud with a given top left corner
         * @param x the x coordinate of the top left corner
         * @param y the y coordinate of the top left corner
         */
        public Cloud(int x, int y) {
            this.x = x;
            this.y = y;
        }

        /**
         * Draws the car
         * @param g2 the graphics component
         */
        public void draw(Graphics2D g2) {
            Ellipse2D.Double cloud = new Ellipse2D.Double(x +100, y +100,
                    100, 100);
            Ellipse2D.Double cloud2 = new Ellipse2D.Double(x +200, y +100,
                    100, 100);
            Ellipse2D.Double cloud3 = new Ellipse2D.Double(x +145, y +110,
                    100, 100);
            Ellipse2D.Double cloud4 = new Ellipse2D.Double(x +160, y +90,
                    100, 100);
            g2.setPaint(Color.WHITE);
            g2.fill(cloud);
            g2.fill(cloud2);
            g2.fill(cloud3);
            g2.fill(cloud4);

            g2.draw(cloud);
            g2.draw(cloud2);
            g2.draw(cloud3);
            g2.draw(cloud4);
        }
}
