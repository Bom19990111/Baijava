package thuchanh1;

import javax.swing.JFrame;

public class DemoJFrame extends JFrame {
	public DemoJFrame() {
		setTitle("Demo JFrame");
		setSize(250, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
	}

	public static void main(String agrs[]) {
		DemoJFrame DJ = new DemoJFrame();
	}
}
