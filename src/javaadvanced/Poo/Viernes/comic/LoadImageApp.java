
package javaadvanced.Poo.Viernes.comic;

/**
 *
 * @author CC-16
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class LoadImageApp extends Component {
         
    BufferedImage descarga;
    BufferedImage descarga1;
    public void paint(Graphics g) {
        g.drawImage(descarga,1, 1, null);
         g.drawImage(descarga1,300, 1,null);
        
    }

    public LoadImageApp() {
       try {
           descarga = ImageIO.read(new File("superman.jpg"));
           descarga1 = ImageIO.read(new File("descarga (1).jpg"));
       } catch (IOException e) {
       }
      
       

    }

    public Dimension getPreferredSize() {
        if (descarga == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(descarga.getWidth(null), descarga.getHeight(null));
       }
        
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Load Image Sample");
        JFrame f1 = new JFrame("Load Image Sample");
            
        f.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f1.add(new LoadImageApp());
        f1.pack();
        f1.setVisible(true);
                f1.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f1.add(new LoadImageApp());
        f1.pack();
        f1.setVisible(true);
    }
}


    
    
    
    

