import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JButton;
import javax.swing.JFrame;


public class TestPrintingFrame implements Printable {
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	//THIS IS WORKING
	
	public TestPrintingFrame() {
		JFrame f = new JFrame();
		f.setTitle("testing");
		f.setSize(100, 100);
		f.setVisible(true);
		f.setLayout(new GridLayout(2,2));
		JButton b = new JButton("Test");
		JButton b1 = new JButton("Test");
		JButton b2 = new JButton("Test");
		JButton b3 = new JButton("Test");
		f.add(b);
		f.add(b2);
		f.add(b3);
		f.add(b1);
		PrinterJob pjob = PrinterJob.getPrinterJob();
		PageFormat preformat = pjob.defaultPage();
		preformat.setOrientation(PageFormat.LANDSCAPE);
		PageFormat postformat = pjob.pageDialog(preformat);
		//If user does not hit cancel then print.
		if (preformat != postformat) {
		    //Set print component
		    pjob.setPrintable(new TestPrintingFrame(f), postformat);
		    if (pjob.printDialog()) {
		        try {
					pjob.print();
				} catch (PrinterException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}
	}
	
	Component comp;

    public TestPrintingFrame(Component comp){
        this.comp = comp;
    }

    @Override
    public int print(Graphics g, PageFormat format, int page_index) 
            throws PrinterException {
        if (page_index > 0) {
            return Printable.NO_SUCH_PAGE;
        }

        // get the bounds of the component
        Dimension dim = comp.getSize();
        double cHeight = dim.getHeight();
        double cWidth = dim.getWidth();

        // get the bounds of the printable area
        double pHeight = format.getImageableHeight();
        double pWidth = format.getImageableWidth();

        double pXStart = format.getImageableX();
        double pYStart = format.getImageableY();

        double xRatio = pWidth / cWidth;
        double yRatio = pHeight / cHeight;


        Graphics2D g2 = (Graphics2D) g;
        g2.translate(pXStart, pYStart);
        g2.scale(xRatio, yRatio);
        comp.paint(g2);

        return Printable.PAGE_EXISTS;
    }
    
    public static void main(String[] args) {
    	new TestPrintingFrame();
    }
}


