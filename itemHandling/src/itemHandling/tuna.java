package itemHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class tuna extends JFrame { // THE INHERITANCE IS IMPORTAAAAAAAAAANT!

	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JPasswordField pass;

	public tuna() {
		super("The Title"); // for the title
		setLayout(new FlowLayout()); // the normal( default ) windows setting.

		text1 = new JTextField(10); // what's on bracket is the typeIN size
		add(text1);

		text2 = new JTextField("Enter text here", 8);
		add(text2);

		text3 = new JTextField("Uneditable", 20);
		text3.setEditable(false); // text3 won't be editable!
		add(text3);

		pass = new JPasswordField("my pass");
		add(pass);

		// verification field, we need event listener here ! IMPORTANT PART

		// THIS IS WHERE EVENT HANDLING STARTS!

		thehandler handler = new thehandler();

		text1.addActionListener(handler); // addActionListener works with objects
		text2.addActionListener(handler);
		text3.addActionListener(handler);
		pass.addActionListener(handler);

	}

	private class thehandler implements ActionListener {
		public void actionPerformed(ActionEvent event) { // we're gonna go throung events
			String string = "";
			if (event.getSource() == text1) {
				string = String.format("Field 1 : %s", event.getActionCommand());
				// with event.getActionCommand() we get what was typed in by users

			} else if (event.getSource() == text2) {
				string = String.format("Field 2 : %s", event.getActionCommand());

			} else if (event.getSource() == text3) {
				string = String.format("Field 3 : %s", event.getActionCommand());

			} else if (event.getSource() == pass) {
				string = String.format("Password : %s", event.getActionCommand());

			}

			JOptionPane.showMessageDialog(null, string);

		}

	}
}
