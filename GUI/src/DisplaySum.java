import javax.swing.JOptionPane;

//this window is gonna be basic for both windows, mac....

public class DisplaySum {

	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter second number");

		// showInputDiaolg always gives a STRING!
		// we need integers to make math operations

		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);

		int sum = num1 + num2;
		// showMessageDialog has 4 parameters
		JOptionPane.showMessageDialog(null, "The sum is " + sum, " SumCalcul ", JOptionPane.PLAIN_MESSAGE);

	}

}
