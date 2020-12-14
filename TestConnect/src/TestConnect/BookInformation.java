package TestConnect;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class BookInformation extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitle;
	private JTable table;
	private DefaultTableModel tableModel = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookInformation frame = new BookInformation();
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
	public BookInformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitle.setBounds(31, 38, 46, 14);
		contentPane.add(lblTitle);

		txtTitle = new JTextField();
		txtTitle.setBounds(92, 36, 168, 20);
		contentPane.add(txtTitle);
		txtTitle.setColumns(10);

		JButton btnList = new JButton("List");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] Name = { "ID", "Title", "Price" };
				tableModel.setColumnIdentifiers(Name);
				table.setModel(tableModel);
				Connection conn = null;
				Statement st = null;
				ResultSet rs = null;
				try {
					String dbURL = "jdbc:sqlserver://localhost; databaseName=QLSACH; user=SA; password=nhatthinh190161";
					conn = DriverManager.getConnection(dbURL);
					String sql = "select *from SACH";
					st = conn.createStatement();
					rs = st.executeQuery(sql);
					while (rs.next()) {
						String rows[] = new String[3];
						rows[0] = rs.getString(1);
						rows[1] = rs.getString(2);
						rows[2] = rs.getString(3);
						tableModel.addRow(rows);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				} finally {
					try {
						if (conn != null) {
							conn.close();
						}
						if (st != null) {
							st.close();
						}
						if (rs != null) {
							rs.close();
						}
					} catch (Exception ex1) {
						ex1.printStackTrace();
					}
				}
			}
		});

		btnList.setBackground(new Color(51, 255, 204));
		btnList.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnList.setBounds(309, 23, 89, 23);
		contentPane.add(btnList);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(309, 54, 89, 23);
		contentPane.add(btnExit);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 90, 357, 148);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Title", "Price" }) {
			Class[] columnTypes = new Class[] { Integer.class, String.class, Float.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);

		JButton btnSeach = new JButton("");

		btnSeach.setBackground(new Color(245, 245, 220));
		btnSeach.setIcon(
				new ImageIcon("C:\\Users\\DAI CHUC\\eclipse-workspace\\PROJECT\\src\\Img\\Start-Menu-Search-icon.png"));
		btnSeach.setBounds(257, 36, 32, 20);
		contentPane.add(btnSeach);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255)), "Filer", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel.setBounds(30, 16, 271, 65);
		contentPane.add(panel);
	}
}
