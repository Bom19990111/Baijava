package QLSV;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Khoahoc extends JPanel {

	/**
	 * Create the panel.
	 */
	public Khoahoc() {
		setBackground(new Color(255, 204, 255));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 255));
		panel.setBounds(10, 10, 474, 330);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\037_Pikachu_icon-icons.com_67297.png"));
		lblNewLabel.setBounds(126, 60, 104, 130);
		panel.add(lblNewLabel);
	}
}
