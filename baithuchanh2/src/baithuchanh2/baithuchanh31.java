package baithuchanh2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class baithuchanh31 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baithuchanh31 frame = new baithuchanh31();
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
	public baithuchanh31() {
		setTitle("DemoBorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNorth = new JLabel("North");
		lblNorth.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNorth.setForeground(Color.WHITE);
		lblNorth.setBackground(Color.RED);
		panel.add(lblNorth);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(135);
		contentPane.add(panel_1, BorderLayout.WEST);
		
		JLabel lblWest = new JLabel("West");
		lblWest.setForeground(Color.WHITE);
		lblWest.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_1.add(lblWest);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setVgap(135);
		contentPane.add(panel_2, BorderLayout.EAST);
		
		JLabel lblEast = new JLabel("East");
		lblEast.setForeground(Color.WHITE);
		lblEast.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblEast.setBackground(Color.BLUE);
		panel_2.add(lblEast);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.RED);
		contentPane.add(panel_3, BorderLayout.SOUTH);
		
		JLabel lblSouth = new JLabel("South");
		lblSouth.setForeground(Color.WHITE);
		lblSouth.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_3.add(lblSouth);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.YELLOW);
		FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
		flowLayout_1.setVgap(135);
		contentPane.add(panel_4, BorderLayout.CENTER);
		
		JLabel lblCenter = new JLabel("Center");
		lblCenter.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_4.add(lblCenter);
	}
}
