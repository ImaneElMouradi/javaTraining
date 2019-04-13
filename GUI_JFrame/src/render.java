import javax.swing.JFrame;

public class render {

	public static void main(String[] args) {

		itemJFrame JFrameObj = new itemJFrame();

		// let's SET stuff

		JFrameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if not we get error when closing window
		JFrameObj.setSize(1200, 700);
		JFrameObj.setVisible(true);
	}

}
