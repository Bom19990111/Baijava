package QLSV;


import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class HocVien extends JPanel {

	/**
	 * Create the panel.
	 */
	public HocVien() {

		setBackground(new Color(255, 153, 255));
		setLayout(null);
		JTextField textField = new JTextField();
		textField.setBounds(10, 78, 314, 40);
		add(textField);
		textField.setColumns(10);
		
		JButton btnThemVao = new JButton("T\u00ECm ki\u1EBFm h\u1ECDc vi\u00EAn");
		btnThemVao.setBounds(365, 76, 179, 40);
		add(btnThemVao);
		btnThemVao.setForeground(new Color(0, 0, 0));
		btnThemVao.setFont(new Font("Arial", Font.BOLD, 15));
		btnThemVao.setBackground(new Color(255, 255, 51));

	}

}
