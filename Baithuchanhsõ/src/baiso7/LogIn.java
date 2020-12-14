package baiso7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LogIn extends JFrame {
	private JPanel contentPane;
	private JTextField textusername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setTitle("login form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN FORM");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(189, 36, 113, 28);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(36, 112, 364, 94);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 55, 68, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(20, 22, 68, 14);
		panel.add(lblNewLabel_2);
		
		textusername = new JTextField();
		textusername.setBounds(177, 11, 149, 33);
		panel.add(textusername);
		textusername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(177, 50, 149, 33);
		panel.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\LẬP TRÌNH DESKTOP\\ICON\\Settings-icon.png"));
		lblNewLabel_3.setBounds(79, 11, 128, 90);
		contentPane.add(lblNewLabel_3);
		
		JButton btnsubmit = new JButton("Submit");
		btnsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 String  dbURL = "jdbc:sqlserver://localhost; databaseName=QLSACH; user=SA; password=nhatthinh190161";
					 Connection conn = DriverManager.getConnection(dbURL);
					 String sql = "select * from Account_1 where Username=? and Passwords=? ";
					 PreparedStatement prst = conn.prepareStatement(sql);
					 prst.setString(1, textusername.getText());
					 prst.setString(2, passwordField.getText());
					 
					 ResultSet rs = prst.executeQuery();
					 if(rs.next()) {
						 Student_interface frmSV = new Student_interface();
						 frmSV.setVisible(true);
					 				}
					 else {
						 JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập không tồn tại hoặc sai mật khẩu");
						 textusername.setText("");
						 passwordField.setText("");
					 }
					 rs.close();
					 prst.close();
					 conn.close();
			}catch (Exception ex) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(rootPane, ex.getMessage());
			}
		}
	});
		
		btnsubmit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnsubmit.setBounds(166, 227, 89, 23);
		contentPane.add(btnsubmit);
	}
	
}
