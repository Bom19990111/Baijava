package baithuchanh2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class baithuchanh32 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baithuchanh32 frame = new baithuchanh32();
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
	public baithuchanh32() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 416, 42);
		contentPane.add(panel);
		
		JLabel lbltitle = new JLabel("DEMO SU DUNG HOP THOAI ");
		lbltitle.setForeground(Color.RED);
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lbltitle);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setHgap(100);
		panel_1.setBounds(10, 109, 416, 42);
		contentPane.add(panel_1);
		
		JButton btnok = new JButton("OK");
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(rootPane, "Bạn vừa nhấn OK đấy");
			}
		});
		btnok.setBackground(new Color(51, 255, 102));
		btnok.setForeground(Color.BLACK);
		btnok.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnok);
		
		JButton btnEXIT = new JButton("EXIT");
		btnEXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		btnEXIT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnEXIT);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnExit);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setHgap(45);
		panel_2.setBounds(10, 189, 426, 64);
		contentPane.add(panel_2);
		
		JButton btnInput = new JButton("INPUT");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(rootPane, "Nhập vào thứ bạn muốn");
			}
		});
		btnInput.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_2.add(btnInput);
		
		JButton btnERROR = new JButton("ERROR");
		btnERROR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(rootPane,"Có lỗi", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnERROR.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_2.add(btnERROR);
		
		JButton btnCANCEL = new JButton("CANCEL");
		btnCANCEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(rootPane,"Bạn muốn tiếp tục không?", "Question", JOptionPane.CANCEL_OPTION);
			}
		});
		btnCANCEL.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_2.add(btnCANCEL);
	}

}
