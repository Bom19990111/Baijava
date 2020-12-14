package baithuchanh4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.FlowLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

public class DemoBorder2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoBorder2 frame = new DemoBorder2();
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
	public DemoBorder2() {
		setTitle("Demo Border2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(139, 45, 386, 315);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 0, 0), 5));
		panel_2.setBounds(10, 10, 168, 46);
		panel_1.add(panel_2);
		
		JLabel lblLineBoder = new JLabel("Line Boder");
		panel_2.add(lblLineBoder);
		lblLineBoder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(7);
		panel_3.setBounds(202, 10, 151, 46);
		panel_1.add(panel_3);
		
		JLabel lblEBoder = new JLabel("Etched Border");
		panel_3.add(lblEBoder);
		lblEBoder.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
		flowLayout_1.setVgap(10);
		panel_4.setBounds(202, 86, 151, 53);
		panel_1.add(panel_4);
		
		JLabel lblRBB = new JLabel("Raise Bever Boder");
		lblRBB.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_4.add(lblRBB);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		FlowLayout flowLayout_2 = (FlowLayout) panel_5.getLayout();
		flowLayout_2.setVgap(10);
		panel_5.setBounds(10, 86, 168, 53);
		panel_1.add(panel_5);
		
		JLabel lblLBB = new JLabel("Lowered Bevel Boder");
		lblLBB.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_5.add(lblLBB);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "Title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		FlowLayout flowLayout_3 = (FlowLayout) panel_6.getLayout();
		flowLayout_3.setVgap(10);
		panel_6.setBounds(202, 169, 151, 53);
		panel_1.add(panel_6);
		
		JLabel lblTitle = new JLabel("Title Boder");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_6.add(lblTitle);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "Title boder (Right)", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		FlowLayout flowLayout_4 = (FlowLayout) panel_7.getLayout();
		flowLayout_4.setVgap(10);
		panel_7.setBounds(10, 169, 168, 53);
		panel_1.add(panel_7);
		
		JLabel lblTitleRight = new JLabel("Title Right");
		lblTitleRight.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_7.add(lblTitleRight);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.BLUE, 3));
		FlowLayout flowLayout_5 = (FlowLayout) panel_8.getLayout();
		flowLayout_5.setVgap(10);
		panel_8.setBounds(10, 252, 168, 53);
		panel_1.add(panel_8);
		
		JLabel lblCompond = new JLabel("Compound Boder");
		lblCompond.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_8.add(lblCompond);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(202, 252, 151, 53);
		panel_1.add(panel_9);
		panel_9.setBorder(new MatteBorder(1, 6, 1, 1, (Color) Color.ORANGE));
		FlowLayout flowLayout_6 = (FlowLayout) panel_9.getLayout();
		flowLayout_6.setVgap(10);
		
		JLabel lblMattleBorder = new JLabel("Mattle Border");
		lblMattleBorder.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_9.add(lblMattleBorder);
	}

}
