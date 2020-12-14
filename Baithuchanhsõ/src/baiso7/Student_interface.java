package baiso7;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Student_interface extends JFrame {

	private JPanel contentPane;
	private JTextField txtFull;
	private JTextField txtAge;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTable tblSINHVIEN;
	private DefaultTableModel dfModel;
	List<SINHVIEN> dsSV = new ArrayList<>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_interface frame = new Student_interface();
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
	public Student_interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Input Student's Detail Information", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel.setBounds(10, 22, 282, 167);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblfull = new JLabel("Full name");
		lblfull.setBounds(10, 24, 86, 17);
		panel.add(lblfull);
		
		txtFull = new JTextField();
		txtFull.setBounds(79, 22, 193, 19);
		panel.add(txtFull);
		txtFull.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 52, 67, 17);
		panel.add(lblGender);
		
		final JComboBox cbgender = new JComboBox();
		cbgender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		cbgender.setBounds(79, 50, 115, 20);
		panel.add(cbgender);
		
		JLabel lblAg = new JLabel("Age");
		lblAg.setBounds(10, 82, 86, 17);
		panel.add(lblAg);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(79, 80, 193, 19);
		panel.add(txtAge);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(10, 109, 86, 17);
		panel.add(lblPhone);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(79, 107, 193, 19);
		panel.add(txtPhone);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 139, 86, 17);
		panel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(79, 137, 193, 19);
		panel.add(txtEmail);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(368, 33, 109, 150);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(10, 11, 89, 23);
		panel_1.add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(10, 48, 89, 23);
		panel_1.add(btnReset);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(10, 82, 89, 23);
		panel_1.add(btnDelete);
		
		JButton btnFind = new JButton("Find");
		btnFind.setBounds(10, 116, 89, 23);
		panel_1.add(btnFind);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 215, 471, 100);
		contentPane.add(scrollPane);
		
		tblSINHVIEN = new JTable();
		tblSINHVIEN.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Full name", "Gender", "Email", "Phone", "Age"
			}
		));
		tblSINHVIEN.getColumnModel().getColumn(0).setPreferredWidth(40);
		tblSINHVIEN.getColumnModel().getColumn(1).setPreferredWidth(100);
		tblSINHVIEN.getColumnModel().getColumn(3).setPreferredWidth(100);
		tblSINHVIEN.getColumnModel().getColumn(5).setPreferredWidth(30);
		
		scrollPane.setColumnHeaderView(tblSINHVIEN);
		dfModel = (DefaultTableModel) tblSINHVIEN.getModel();
		
		//Showstudent();
	}
	
	/*private void Showstudent(){
		dsSV = StudentModify.findAll();
		
		dfModel.setRowCount(0);
		for (SINHVIEN sv : dsSV){
			dfModel.addRow(new Object[]{
					dfModel.getRowCount()+1, sv.getFullname(), sv.getGender(), sv.getEmail(),sv.getPhone(), sv.getAge()});
		}
			
	}*/
	
}


