package QLsinhvien;




import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Bai02 extends JFrame {
	
	private JPanel contentPane;
	private JComboBox<String> cbHoten;
	ArrayList<String> dsach = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai02 frame = new Bai02();
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
	public Bai02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\JAVA DESKTOP\\info.png"));
		lblNewLabel.setBounds(56, 48, 137, 156);
		contentPane.add(lblNewLabel);
		
		@SuppressWarnings("unchecked")
		final
		
		JComboBox cbHoten = new JComboBox();
		cbHoten.setBounds(226, 86, 179, 27);
		contentPane.add(cbHoten);
		
		JLabel lblHinThThng = new JLabel("Hi\u1EC3n th\u1ECB th\u00F4ng tin sinh vi\u00EAn");
		lblHinThThng.setForeground(Color.RED);
		lblHinThThng.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblHinThThng.setBounds(67, 25, 307, 27);
		contentPane.add(lblHinThThng);
		
		JButton btnChiTiet = new JButton("Chi ti\u1EBFt");
		btnChiTiet.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnChiTiet.setBounds(329, 212, 97, 27);
		contentPane.add(btnChiTiet);
		btnChiTiet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fullname = cbHoten.getSelectedItem().toString();
				InforStudent form = new InforStudent(fullname);
				form.setVisible(true);
			}
		});
		
		dsach = Connectlist.LoadDatatoCombobox();
		for (String item: dsach) {
			cbHoten.addItem(item.toString());
		}
	}
}
