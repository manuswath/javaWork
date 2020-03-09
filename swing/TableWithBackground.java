import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.beans.PropertyVetoException;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TableWithBackground {

    public static void main(String[] args) {
        new TableWithBackground();
    }

    public TableWithBackground() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                JDesktopPane desktopPane = new JDesktopPane();
                BackgroundInternalFrame backgroundInternalFrame = new BackgroundInternalFrame();
                desktopPane.add(backgroundInternalFrame);
                try {
                    backgroundInternalFrame.setMaximum(true);
                } catch (PropertyVetoException ex) {
                    ex.printStackTrace();
                }

                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(desktopPane);
                frame.setSize(200, 200);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}