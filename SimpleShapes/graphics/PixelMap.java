package graphics;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by rmhedge on 9/2/17.
 */
public abstract class PixelMap {

    private int width = 25;
    private int height = 25;
    protected Color[][] pixelMap;
    protected Color[] colors;

    public Color[][] getPixelMap(int[][] subclassMap) {
        Color[][] retVal = new Color[height][width];
        for(int i=0;i<subclassMap.length;i++) {
            for(int j=0;j<subclassMap[i].length;j++){
                retVal[i][j] = colors[subclassMap[i][j]];
            }
        }
        return retVal;
    }

    public abstract Color[][] getPixelMap();

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public BufferedImage asImage() {
        BufferedImage bufferedImage = new BufferedImage(this.getHeight(),this.getWidth(),BufferedImage.TYPE_INT_RGB);
        Color[][] colors = this.getPixelMap();

        for(int i=0;i<this.getWidth();i++) {
            for(int j=0;j<this.getHeight();j++) {
                bufferedImage.setRGB(i,j,colors[j][i].getRGB());
            }
        }
        return bufferedImage;
    }
}
