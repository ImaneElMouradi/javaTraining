import java.awt.FlowLayout; // the default screen/window organizing 

import javax.swing.JFrame; // window features( minimize, close etc )
import javax.swing.JLabel; // JLabel allows to put texts.

public class itemJFrame extends JFrame {

	private JLabel item1; // labels can be texts

	public itemJFrame() { // constructor

		// the window
		super("Mini Game"); // TITLE
		setLayout(new FlowLayout()); // default layout

		// the item
		item1 = new JLabel("Welcome to our game!");
		item1.setToolTipText("Hover");

		// Add item to window
		add(item1);

	}

}
