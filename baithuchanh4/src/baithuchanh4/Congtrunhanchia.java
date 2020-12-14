package baithuchanh4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


public class Congtrunhanchia extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private JRadioButton rdbtnSum;
	private JRadioButton rdbtnTru;
	private JRadioButton rdbtnNhan;
	private JRadioButton rdbtnChia;
	private JPanel panel_2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Congtrunhanchia frame = new Congtrunhanchia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Congtrunhanchia() {
		setTitle("Math");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 532);
		JPanel contentPane = new JPanel();
		contentPane .setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 23, 618, 53);
		contentPane.add(panel);
		
		JLabel lblTitle = new JLabel("C\u1ED9ng tr\u1EEB nh\u00E2n chia");
		lblTitle.setForeground(Color.MAGENTA);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 29));
		panel.add(lblTitle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Ch\u1ECDn t\u00E1c v\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(10);
		panel_1.setBounds(20, 95, 119, 294);
		contentPane.add(panel_1);
		
		JButton btnGiai = new JButton("Gi\u1EA3i");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double soa = Double.parseDouble(textField.getText());
				Double sob = Double.parseDouble(textField_1.getText());
				if(rdbtnSum.isSelected()) {
					textField_2.setText(Double.toString(soa+sob));
				}
				if(rdbtnTru.isSelected()) {
					textField_2.setText(Double.toString(soa-sob));
				}
				if(rdbtnNhan.isSelected()) {
					textField_2.setText(Double.toString(soa*sob));
				}
				if(rdbtnChia.isSelected()) {
					textField_2.setText(Double.toString(soa/sob));
				}
			}
			});
		
		btnGiai.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel_1.add(btnGiai);
		
		JButton btnXoa = new JButton("X\u00F3a");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel_1.add(btnXoa);
		
		JButton btnThoat = new JButton("Tho\u00E1t");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int note = JOptionPane.showInternalConfirmDialog(null, "Bạn có muốn thoát không?", "Exit", JOptionPane.YES_NO_OPTION);
				if (note == JOptionPane.YES_OPTION) {
				System.exit(0);
				}
			}
		});
		btnThoat.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel_1.add(btnThoat);
		
		panel_2 = new JPanel();
		panel_2.setBounds(149, 104, 479, 77);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 10));
		
		JLabel lblsoa = new JLabel("S\u1ED1 a");
		lblsoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(lblsoa);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblsob = new JLabel("Số b");
		lblsob.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(lblsob);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Ch\u1ECDn ph\u00E9p to\u00E1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(181, 205, 410, 184);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 180, 10));
		
		rdbtnSum = new JRadioButton("C\u1ED9ng");
		panel_3.add(rdbtnSum);
		
		rdbtnTru = new JRadioButton("Tr\u1EEB");
		panel_3.add(rdbtnTru);
		
		rdbtnNhan = new JRadioButton("Nh\u00E2n");
		panel_3.add(rdbtnNhan);
		
		rdbtnChia = new JRadioButton("Chia");
		panel_3.add(rdbtnChia);
		
		JLabel lblketqua = new JLabel("K\u1EBFt qu\u1EA3");
		lblketqua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblketqua.setBounds(164, 429, 87, 24);
		contentPane.add(lblketqua);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setBounds(248, 431, 380, 29);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
 }
}
