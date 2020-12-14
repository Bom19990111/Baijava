package baithuchanh4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormSV extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblTiTle;
	private JTextField textField_2;
	private JLabel lblNickName;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPanel panel_2;
	private JLabel lblMailFormat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSV frame = new FormSV();
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
	public FormSV() {
		setTitle("FormSV");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 739, 115);
		panel.setBorder(new TitledBorder(null, "Name", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 4, 30, 30));
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblFirstName);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblLastName);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		lblTiTle = new JLabel("Title");
		lblTiTle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblTiTle);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		lblNickName = new JLabel("Nick Name");
		lblNickName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNickName);
		
		textField_3 = new JTextField();
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Email", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(5, 130, 749, 308);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEmail = new JLabel("Email Address");
		lblEmail.setBounds(10, 10, 150, 34);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setBounds(148, 10, 420, 31);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_2.setBounds(10, 68, 565, 146);
		panel_1.add(panel_2);
		
		JList list = new JList();
		list.setBackground(UIManager.getColor("Button.background"));
		list.setFont(new Font("Tahoma", Font.PLAIN, 20));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Iterm 1", "Iterm 2", "Iterm 3", "Iterm 4", "Iterm 5"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel_2.add(list);
		
		lblMailFormat = new JLabel("Mail Format:");
		lblMailFormat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMailFormat.setBounds(10, 230, 150, 25);
		panel_1.add(lblMailFormat);
		
		JRadioButton rdbtnHTML = new JRadioButton("HTML");
		rdbtnHTML.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnHTML.setBounds(10, 264, 103, 21);
		panel_1.add(rdbtnHTML);
		
		JRadioButton rdbtnPlainText = new JRadioButton("Plain Text");
		rdbtnPlainText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnPlainText.setBounds(145, 264, 150, 21);
		panel_1.add(rdbtnPlainText);
		
		JRadioButton rdbtnCustom = new JRadioButton("Custom");
		rdbtnCustom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnCustom.setBounds(317, 264, 103, 21);
		panel_1.add(rdbtnCustom);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBounds(585, 68, 85, 34);
		panel_1.add(btnAdd);
		
		JButton btnEDIT = new JButton("EDIT");
		btnEDIT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEDIT.setBounds(585, 127, 85, 34);
		panel_1.add(btnEDIT);
		
		JButton btnDELETE = new JButton("DELETE");
		btnDELETE.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDELETE.setBounds(585, 180, 102, 34);
		panel_1.add(btnDELETE);
		
		JButton btnOK = new JButton("OK");
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK.setBounds(486, 448, 85, 31);
		contentPane.add(btnOK);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(599, 448, 85, 31);
		contentPane.add(btnExit);
	}
}
