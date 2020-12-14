package baithuchanh2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoTinh extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoTinh frame = new DemoTinh();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DemoTinh() {
		setBackground(SystemColor.controlHighlight);
		setTitle("Math");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 483);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.light"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea text = new JTextArea();
		text.setBackground(UIManager.getColor("CheckBox.light"));
		text.setBounds(215, 10, 142, 35);
		text.setForeground(Color.RED);
		text.setFont(new Font("Monospaced", Font.BOLD, 23));
		text.setText("B\u1EA2NG T\u00CDNH");
		contentPane.add(text);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.light"));
		panel.setBounds(10, 62, 563, 140);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 2, 6, 10));
		
		JLabel lblFirstNumber = new JLabel("First Number");
		panel.add(lblFirstNumber);
		lblFirstNumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSeconNumber = new JLabel("Secon Number");
		lblSeconNumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblSeconNumber);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEResuilt = new JLabel("Resuilt");
		lblEResuilt.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblEResuilt);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.light"));
		panel_1.setBounds(10, 299, 563, 117);
		contentPane.add(panel_1);
		
		final JButton btntong = new JButton("+");
		btntong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btntong) {
					Double a = Double.parseDouble(textField.getText());
					Double b = Double.parseDouble(textField_1.getText());
					textField_2.setText(Double.toString(a+b));		
				}
			}
		});
		btntong.setForeground(new Color(0, 0, 205));
		btntong.setBackground(new Color(135, 206, 250));
		btntong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btntong);
		
		final JButton btnhieu = new JButton("-");
		btnhieu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnhieu) {
					Double a = Double.parseDouble(textField.getText());
					Double b = Double.parseDouble(textField_1.getText());
					textField_2.setText(Double.toString(a-b));		
				}
			}
		});
		
		btnhieu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnhieu);
			
		
		final JButton btnnhan = new JButton("*");
		btnnhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnnhan) {
					Double a = Double.parseDouble(textField.getText());
					Double b = Double.parseDouble(textField_1.getText());
					textField_2.setText(Double.toString(a*b));		
				}
			}
		});
		btnnhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnnhan);
		
		JButton btnchia = new JButton("/");
		btnchia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnchia) {
					Double a = Double.parseDouble(textField.getText());
					Double b = Double.parseDouble(textField_1.getText());
					textField_2.setText(Double.toString(a/b));		
				}
			}
		});
		btnchia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnchia);
		
		final JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnCancel);
	}

}
