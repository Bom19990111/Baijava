package QLSV;


import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class TrangChinh extends JPanel {
	public TrangChinh() {
		setBackground(new Color(255, 204, 255));
		setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 102, 102));
		panel_3.setBounds(10, 10, 198, 147);
		add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel = new JLabel("27");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(130, 10, 58, 50);
		panel_3.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Kho\u00E1 h\u1ECDc");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(82, 99, 106, 38);
		panel_3.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(147, 112, 219));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\phant\\Downloads\\Downloads\\2x\\baseline_assignment_black_24dp.png"));
		lblNewLabel_2.setBounds(10, 46, 45, 43);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(65, 10, 4, 117);
		panel_3.add(panel_1);

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(51, 255, 153));
		panel_3_1.setBounds(447, 10, 198, 147);
		add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("15");
		lblNewLabel_6.setBackground(new Color(255, 255, 255));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_6.setBounds(137, 10, 51, 46);
		panel_3_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4_1 = new JLabel("H\u1ED9p Th\u01B0");
		lblNewLabel_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(94, 107, 94, 30);
		panel_3_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setIcon(new ImageIcon("C:\\Users\\phant\\Downloads\\mail_outline-black-24dp\\2x\\baseline_mail_outline_black_24dp.png"));
		lblNewLabel_5_1.setBounds(10, 31, 62, 70);
		panel_3_1.add(lblNewLabel_5_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(230, 230, 250));
		panel_1_2.setBounds(82, 10, 4, 117);
		panel_3_1.add(panel_1_2);

		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(153, 204, 255));
		panel_3_2.setForeground(new Color(255, 255, 255));
		panel_3_2.setBounds(229, 10, 198, 147);
		add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("40");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_3.setBounds(143, 22, 45, 36);
		panel_3_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\phant\\Downloads\\Downloads\\2x\\baseline_account_circle_black_24dp.png"));
		lblNewLabel_5.setBounds(10, 30, 62, 70);
		panel_3_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("H\u1ECDc vi\u00EAn");
		lblNewLabel_4.setBounds(96, 107, 94, 30);
		panel_3_2.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 20));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(230, 230, 250));
		panel_1_1.setBounds(82, 10, 4, 117);
		panel_3_2.add(panel_1_1);
	}
}
