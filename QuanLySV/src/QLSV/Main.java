package QLSV;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("\u1EE8ng d\u1EE5ng qu\u1EA3n l\u00FD sinh vi\u00EAn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 933, 468);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 255));
		panel_1.setBounds(10, 10, 233, 448);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 233, 61);
		panel_3.setBackground(new Color(255, 0, 0));
		panel_1.add(panel_3);

		JLabel lblquanly = new JLabel("QU\u1EA2N L\u00DD H\u1ECCC VI\u00CAN");
		panel_3.add(lblquanly);
		lblquanly.setIcon(new ImageIcon(
				"C:\\Users\\phant\\Downloads\\color_lens-black-24dp\\2x\\baseline_color_lens_black_24dp.png"));
		lblquanly.setBackground(new Color(255, 0, 0));
		lblquanly.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblquanly.setHorizontalAlignment(SwingConstants.CENTER);
		lblquanly.setForeground(new Color(255, 255, 255));

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 191, 255));
		panel_4.setBounds(10, 108, 212, 61);
		panel_1.add(panel_4);

		JLabel lblScreen = new JLabel("M\u00C0N H\u00CCNH CH\u00CDNH");
		lblScreen.setIcon(
				new ImageIcon("C:\\Users\\phant\\Downloads\\airplay-black-24dp\\2x\\baseline_airplay_black_24dp.png"));
		lblScreen.setHorizontalAlignment(SwingConstants.CENTER);
		lblScreen.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_4.add(lblScreen);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(95, 158, 160));
		panel_5.setForeground(new Color(255, 255, 255));
		panel_5.setBounds(9, 207, 213, 61);
		panel_1.add(panel_5);

		JLabel lblHocvien = new JLabel("QU\u1EA2N L\u00DD H\u1ECCC VI\u00CAN");
		lblHocvien.setIcon(new ImageIcon(
				"C:\\Users\\phant\\Downloads\\person_search-black-24dp\\2x\\baseline_person_search_black_24dp.png"));
		lblHocvien.setForeground(new Color(255, 255, 0));
		lblHocvien.setHorizontalAlignment(SwingConstants.CENTER);
		lblHocvien.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_5.add(lblHocvien);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 250, 154));
		panel_6.setBounds(9, 313, 213, 61);
		panel_1.add(panel_6);

		JLabel lblKhoahoc = new JLabel("QU\u1EA2N L\u00DD KH\u00D3A H\u1ECCC");
		lblKhoahoc.setIcon(
				new ImageIcon("C:\\Users\\phant\\Downloads\\list-black-24dp\\2x\\baseline_list_black_24dp.png"));
		lblKhoahoc.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(lblKhoahoc);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(253, 10, 688, 448);
		panel.add(panel_2);
		List<DanhMuc> listDanhMuc = new ArrayList<>();
		listDanhMuc.add(new DanhMuc("Trangchu", panel_4, lblScreen));
		listDanhMuc.add(new DanhMuc("Hocvien", panel_5, lblHocvien));
		listDanhMuc.add(new DanhMuc("Khoahoc", panel_6, lblKhoahoc));

		chuyenmanhinh controller = new chuyenmanhinh(panel_2);
		panel_2.setLayout(null);
		controller.setView(panel_4, lblScreen);
		controller.setEvent(listDanhMuc);
	}
}
