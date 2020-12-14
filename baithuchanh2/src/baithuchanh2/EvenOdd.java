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
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EvenOdd extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EvenOdd frame = new EvenOdd();
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
	public EvenOdd() {
		setTitle("Input");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 20, 416, 43);
		contentPane.add(panel);
		
		JLabel lbltieude = new JLabel("KI\u1EC2M TRA S\u1ED0 NGUY\u00CAN ");
		lbltieude.setForeground(Color.RED);
		lbltieude.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lbltieude);
		
		textField = new JTextField();
		textField.setBounds(31, 111, 384, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTitle = new JLabel("Nhập 1 số nguyên:");
		lblTitle.setBounds(31, 73, 234, 28);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblTitle);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setHgap(10);
		panel_1.setBounds(31, 189, 384, 52);
		contentPane.add(panel_1);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer a = Integer.parseInt(textField.getText());
				String  b ="Số này là số " +((a%2==0)? "chẵn":"lẻ");
				JOptionPane.showMessageDialog(rootPane,b ,"OutPut", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnOK);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnClear);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(rootPane,"Bạn muốn tiếp tục không?", "Question", JOptionPane.CANCEL_OPTION);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(btnCancel);
	}
}
