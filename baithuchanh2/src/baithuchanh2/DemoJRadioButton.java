package baithuchanh2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class DemoJRadioButton extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoJRadioButton frame = new DemoJRadioButton();
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
	public DemoJRadioButton() {
		setTitle("Radio Button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtTiTle = new JTextArea();
		txtTiTle.setBounds(164, 28, 132, 51);
		txtTiTle.setForeground(Color.RED);
		txtTiTle.setBackground(UIManager.getColor("Button.highlight"));
		txtTiTle.setFont(new Font("Monospaced", Font.BOLD, 21));
		txtTiTle.setText("S\u1EDE TH\u00CDCH");
		contentPane.add(txtTiTle);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(3);
		flowLayout.setHgap(10);
		panel.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel.setBounds(10, 89, 416, 60);
		contentPane.add(panel);
		
		JRadioButton rdbtnNghenhac = new JRadioButton("Nghe nh\u1EA1c");
		rdbtnNghenhac.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNghenhac.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(rdbtnNghenhac);
		
		JRadioButton rdbtnXemfilm = new JRadioButton("Xem phim");
		rdbtnXemfilm.setBackground(UIManager.getColor("Button.highlight"));
		rdbtnXemfilm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(rdbtnXemfilm);
		
		JRadioButton rdbtnDulich = new JRadioButton("Du l\u1ECBch");
		rdbtnDulich.setBackground(UIManager.getColor("Button.highlight"));
		rdbtnDulich.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(rdbtnDulich);
		
		JRadioButton rdbtnKhac = new JRadioButton("Kh\u00E1c");
		rdbtnKhac.setBackground(UIManager.getColor("Button.highlight"));
		rdbtnKhac.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(rdbtnKhac);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.highlight"));
		panel_1.setBounds(85, 170, 281, 43);
		contentPane.add(panel_1);
		
		JButton btnOK = new JButton("Ok");
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 21));
		panel_1.add(btnOK);
	}
}
