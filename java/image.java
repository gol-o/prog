import java.awt.Graphics;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class GrayScaler {

   
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BufferedImage img = null;
        try {
            img=ImageIO.read(new File("C:/Users/test/Desktop/Server.jpg"));
            
            Integer width = img.getWidth();
            Integer height = img.getHeight();
             
            BufferedImage image = new BufferedImage( width, height, BufferedImage.TYPE_4BYTE_ABGR_PRE );
            image.createGraphics().drawImage( img, 0, 0, width, height, null );
             
            ColorSpace grayColorSpace = ColorSpace.getInstance( ColorSpace.CS_GRAY );
            ColorConvertOp op = new ColorConvertOp( grayColorSpace, image.getColorModel().getColorSpace(), null );
            op.filter( image, image );
                        
            JLabel label = new JLabel(new ImageIcon(image));
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.getContentPane().add(new JScrollPane(label));
            f.setSize(400,400);
            f.setLocation(200,200);
            f.setVisible(true);
            
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
           
    }

}
