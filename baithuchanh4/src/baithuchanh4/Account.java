package baithuchanh4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JSeparator;

public class Account extends JFrame {

	private JPanel contentPane;
	private JTextField textNumber;
	private JTextField textName;
	private JTextField textMoney;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Account frame = new Account();
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
	public Account() {
		setTitle("Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 513);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 153));
		panel.setBounds(10, 97, 650, 94);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 2, 0, 8));
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		panel.add(lblAccountNumber);
		lblAccountNumber.setForeground(new Color(255, 99, 71));
		lblAccountNumber.setFont(new Font("Trebuchet MS", Font.ITALIC, 17));
		
		textNumber = new JTextField();
		textNumber.setBackground(new Color(255, 255, 255));
		panel.add(textNumber);
		textNumber.setColumns(10);
		
		JLabel lblAccountName = new JLabel("Account Name");
		lblAccountName.setForeground(new Color(0, 139, 139));
		lblAccountName.setFont(new Font("Trebuchet MS", Font.ITALIC, 17));
		panel.add(lblAccountName);
		
		textName = new JTextField();
		panel.add(textName);
		textName.setColumns(10);
		
		JLabel lblAccountMoney = new JLabel("Account Money");
		lblAccountMoney.setForeground(new Color(0, 0, 139));
		lblAccountMoney.setFont(new Font("Trebuchet MS", Font.ITALIC, 17));
		panel.add(lblAccountMoney);
		
		textMoney = new JTextField();
		panel.add(textMoney);
		textMoney.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 204, 153));
		panel_2.setBounds(10, 397, 650, 69);
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setVgap(8);
		flowLayout.setHgap(8);
		contentPane.add(panel_2);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBackground(new Color(255, 255, 204));
		btnDelete.setForeground(new Color(255, 0, 153));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNumber.setText("");
				textName.setText("");
				textMoney.setText("");
			}
		});
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBackground(new Color(255, 255, 204));
		panel_2.add(btnAdd);
		btnAdd.setForeground(new Color(204, 0, 51));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				String list[] = {textNumber.getText(), textName.getText(), textMoney.getText()};
				model.addRow(list);
			}
		});
		btnAdd.setVerticalAlignment(SwingConstants.BOTTOM);
		btnAdd.setFont(new Font("Sitka Text", Font.ITALIC, 17));
		btnDelete.setVerticalAlignment(SwingConstants.BOTTOM);
		btnDelete.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		panel_2.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(new Color(255, 255, 204));
		btnExit.setForeground(new Color(153, 0, 153));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setVerticalAlignment(SwingConstants.BOTTOM);
		btnExit.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		panel_2.add(btnExit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 226, 650, 125);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(255, 69, 0));
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setViewportView(table);
		table.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"13", "Tran Nhat Thinh", "4000"},
				{"12", "Phan Hai", "6000"},
				{"123", "Nguyen Van Nam", "2000"},
				{"542", "Phan Van Dat", "1500"},
				{"421", "Tran Huu Canh", "6040"},
				{"31", "Nguyen Giang", "3000"},
			},
			new String[] {
				"Acc Number", "Acc Name", "Acc Money"
			}
		));
		
		JLabel lblTitle = new JLabel("Tiền lương nhân viên");
		lblTitle.setBounds(162, 10, 358, 54);
		lblTitle.setForeground(new Color(0, 102, 153));
		lblTitle.setFont(new Font("Verdana", Font.BOLD, 30));
		contentPane.add(lblTitle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 153));
		panel_1.setBounds(10, 206, 650, 181);
		contentPane.add(panel_1);
		table.getColumnModel().getColumn(1).setPreferredWidth(129);
		table.getColumnModel().getColumn(1).setMinWidth(17);
		table.getColumnModel().getColumn(2).setPreferredWidth(106);
		table.getColumnModel().getColumn(2).setMinWidth(17);
	}
}
