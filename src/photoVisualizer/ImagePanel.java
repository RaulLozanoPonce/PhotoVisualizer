package photoVisualizer;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{
    
    private BufferedImage img, imgCopy, icon;
    private int iconX;
    private int iconY;
    
    public ImagePanel(){
        initComponents();
        setImage("https://www.dictando.com/wp-content/uploads/2018/07/dictado-mi-casa-A1.jpg");
    }
    
    public boolean setImage(String url){
        try{
            img = ImageIO.read(new URL(url));
            icon = ImageIO.read(new URL("https://png.pngtree.com/element_our/sm/20180626/sm_5b321ca7a1ca4.png"));            
            imgCopy = deepCopy(img);
            return true;
        } catch (IOException e){
            System.out.print(e);
            return false;
        }
    }

    static BufferedImage deepCopy(BufferedImage bi) {
        ColorModel cm = bi.getColorModel();
        boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
        WritableRaster raster = bi.copyData(null);
        return new BufferedImage(cm, raster, isAlphaPremultiplied, null);
    }
    
    public void invertMode(boolean cRed, boolean cGreen, boolean cBlue){
        int mask = 0x000000;
        if (cRed) mask = mask | 0xFF0000;
        if (cGreen) mask = mask | 0x00FF00;
        if (cBlue) mask = mask | 0x0000FF;
        
        imgCopy = deepCopy(img);
        for (int j=0;j<img.getHeight();j++){
            for (int i=0;i<img.getWidth();i++){
                imgCopy.setRGB(i, j, mask & img.getRGB(i, j));
            }
        }
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imgCopy, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(icon,iconX,iconY,64,64,this);
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }

    public void setIconX(int iconX) {
        this.iconX = iconX;
    }

    public void setIconY(int iconY) {
        this.iconY = iconY;
    }
}
