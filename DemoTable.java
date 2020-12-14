import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoTable extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoTable frame = new DemoTable();
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
	public DemoTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 101, 321, 134);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Acc Number", "Acc Name", "Acc Money"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Account Number");
		lblNewLabel.setBounds(21, 10, 109, 13);
		contentPane.add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setBounds(140, 7, 202, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Account Name ");
		lblNewLabel_1.setBounds(21, 39, 109, 13);
		contentPane.add(lblNewLabel_1);
		
		txt2 = new JTextField();
		txt2.setBounds(140, 36, 202, 19);		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Account Money");
		lblNewLabel_2.setBounds(21, 67, 109, 13);
		contentPane.add(lblNewLabel_2);
		
		txt3 = new JTextField();
		txt3.setBounds(140, 65, 202, 19);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		JButton btn1 = new JButton("Add");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				String arr[] = {txt1.getText(),txt2.getText(),txt3.getText()};
				model.addRow(arr);
				
			}
		});
		btn1.setBounds(45, 288, 85, 21);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Clear");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
			}
		});
		btn2.setBounds(153, 288, 85, 21);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("Exit");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn3.setBounds(267, 288, 85, 21);
		contentPane.add(btn3);
	}
}
