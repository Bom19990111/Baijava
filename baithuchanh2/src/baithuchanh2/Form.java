package baithuchanh2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Window.Type;

public class Form extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
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
	public Form() {
		setFont(new Font("Arial", Font.PLAIN, 20));
		setTitle("Form ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 101, 398, 74);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 2, 0, 10));
		
		lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		panel.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Sign Up");
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(158, 10, 144, 58);
		contentPane.add(lblNewLabel_2);
	}
}
