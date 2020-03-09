import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class SettingBkgrdImageToJFrame {

    public static void main(String[] args) {
    	JFrame f = new JFrame();
    	try {
    		f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("6.jpg")))));
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	f.pack();
    	f.setVisible(true);
    }

}