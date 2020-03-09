import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BackgroundInternalFrame extends JInternalFrame {

	public BackgroundInternalFrame() {
		super("Hello", true, true, true, true);

		setSize(100, 100);
		setLocation(10, 10);
		setVisible(true);

		//setContentPane(new TransparentContentPane());

		JTable table = new JTable();
		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null } },
				new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));

		JScrollPane scrollPane = new JScrollPane(table);
		setLayout(new BorderLayout());
		add(scrollPane);

		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		table.setOpaque(false);
		table.setBackground(new Color(255, 255, 255, 0));
	}
}
