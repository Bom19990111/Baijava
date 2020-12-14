package baithuchanh4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class DemoDouble extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNumber;
	private JTextField textFieldResuilt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoDouble frame = new DemoDouble();
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
	public DemoDouble() {
		setTitle("Demo Double");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 426, 47);
		contentPane.add(panel);
		
		JLabel lblTitle = new JLabel("Double is...");
		lblTitle.setForeground(Color.RED);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(lblTitle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 85, 426, 121);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTitle1 = new JLabel("Enter a number");
		lblTitle1.setBounds(1, 0, 126, 53);
		lblTitle1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblTitle1);
		
		textFieldNumber = new JTextField();
		textFieldNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldNumber.setBounds(192, 3, 180, 53);
		panel_1.add(textFieldNumber);
		textFieldNumber.setColumns(10);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(215, 0, 102, 53);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(322, 0, 102, 53);
		panel_1.add(label_3);
		
		JButton btnCheck = new JButton("Double is");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCheck) {
					Double number = Double.parseDouble(textFieldNumber.getText());
					textFieldResuilt.setText(Double.toString(number *2));
				}
			}
		});
		btnCheck.setBounds(1, 58, 136, 53);
		btnCheck.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(btnCheck);
		
		textFieldResuilt = new JTextField();
		textFieldResuilt.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldResuilt.setBounds(192, 61, 180, 53);
		panel_1.add(textFieldResuilt);
		textFieldResuilt.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(215, 58, 102, 53);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(322, 58, 102, 53);
		panel_1.add(label_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(15, 227, 416, 47);
		contentPane.add(panel_2);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_2.add(btnExit);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNumber.setText("");
				textFieldResuilt.setText("");
				
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_2.add(btnCancel);
	}
}
