package thuchanh1;

import javax.swing.JFrame;

public class DemoJFrame1 {

	public DemoJFrame1() {
		JFrame F = new JFrame();
		F.setTitle("Demo JFrame");
		F.setSize(250, 100);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F.setLocationRelativeTo(null); // nằm giữa màn hình
		F.setResizable(true);
		F.setVisible(true);
	}

	public static void main(String agrs[]) {
		DemoJFrame1 a = new DemoJFrame1();

	}
}
