import java.awt.print.*;
import java.awt.*;
import javax.swing.*;

public class PrintEntireFrame extends javax.swing.JFrame implements Printable {

	
//THIS IS NOT WORKING
//THIS IS NOT WORKING
//THIS IS NOT WORKING
//THIS IS NOT WORKING
//THIS IS NOT WORKING
//THIS IS NOT WORKING
//THIS IS NOT WORKING
//THIS IS NOT WORKING

	
	
	
	
	JFrame frameToPrint;
	
	public PrintEntireFrame() {
		super();
		super.setVisible(true);
    }
	
	@Override
	public int print(Graphics g, PageFormat pf, int page)
			throws PrinterException {

		if (page > 0) { /* We have only one page, and 'page' is zero-based */
			return NO_SUCH_PAGE;
		}

		/*
		 * User (0,0) is typically outside the imageable area, so we must
		 * translate by the X and Y values in the PageFormat to avoid clipping
		 */
		Graphics2D g2d = (Graphics2D) g;
		g2d.translate(pf.getImageableX(), pf.getImageableY());

		/* Now print the window and its visible contents */
		frameToPrint.printAll(g);

		/* tell the caller that this page is part of the printed document */
		return PAGE_EXISTS;
	}

	public PrintEntireFrame(JFrame f) {
		super.setVisible(true);
		JButton b = new JButton("click");
		f.add(b);
		frameToPrint = f;
	}

	private void OK_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
		PrinterJob job = PrinterJob.getPrinterJob();
		// job.setPrintable();
		boolean ok = job.printDialog();
		if (ok) {
			try {
				job.print();
			} catch (PrinterException ex) {
				ex.printStackTrace(System.err);
			}
		}
	}
	
	public static void main(String args[]) {
        JFrame f = new JFrame("Print UI Example");
        f.setTitle("Welcome");
        f.setSize(10,10);
        new PrintEntireFrame(f);
    }

}
