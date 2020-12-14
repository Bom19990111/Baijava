package QLsinhvien;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InforStudent extends JFrame {
 	
	private JPanel contentPane;
	private JTextField txtHoten;
	private JTextField txtTuoi;
	private JTextField txtPhone;
	private JTextField txtEmail;
	ArrayList<String> dsach = new ArrayList<>();
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public InforStudent(String fullname) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 451, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		final
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 416, 52);
		contentPane.add(panel);
		
		JLabel lblInforStudent = new JLabel("INFOR STUDENT");
		lblInforStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblInforStudent.setForeground(Color.RED);
		lblInforStudent.setFont(new Font("Times New Roman", Font.BOLD, 32));
		panel.add(lblInforStudent);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 72, 416, 181);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 2, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Full Name");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		panel_1.add(lblNewLabel);
		
		txtHoten = new JTextField();
		panel_1.add(txtHoten);
		txtHoten.setColumns(20);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_1);
		
		txtTuoi = new JTextField();
		panel_1.add(txtTuoi);
		txtTuoi.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Phone");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		panel_1.add(lblNewLabel_2);
		
		txtPhone = new JTextField();
		panel_1.add(txtPhone);
		txtPhone.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		panel_1.add(lblNewLabel_3);
		
		txtEmail = new JTextField();
		panel_1.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnClose.setBounds(282, 263, 144, 37);
		contentPane.add(btnClose);
		
		LoadTableDetail(fullname);
	}
	public void LoadTableDetail(String fullname) {
		Connection conn = null;
		ResultSet result = null;
		try {
			String dbURL = "jdbc:sqlserver://localhost; databaseName=SV; user=SA; password=nhatthinh190161";
			conn = DriverManager.getConnection(dbURL);
			
		    //query
		    String sql = "select * from student where fullname=?";
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1, fullname);
			
			result = statement.executeQuery();
			
			while(result.next()) {
				txtHoten.setText(result.getString("fullname"));
				txtTuoi.setText(result.getString("age"));
				txtPhone.setText(result.getString("phone"));
				txtEmail.setText(result.getString("email"));
			}
		}catch (SQLException ex) {
			
		}
	}
}

