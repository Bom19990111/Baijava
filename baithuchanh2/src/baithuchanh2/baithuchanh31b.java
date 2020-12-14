package baithuchanh2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class baithuchanh31b extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baithuchanh31b frame = new baithuchanh31b();
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
	public baithuchanh31b() {
		setTitle("DemoLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 10, 233, 51);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setHgap(-4);
		contentPane.add(panel);
		
		JButton btnfirstbutton = new JButton("B0");
		btnfirstbutton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnfirstbutton);
		
		JButton btnseconbutton = new JButton("B1");
		btnseconbutton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel.add(btnseconbutton);
		
		JButton btnThirstbutton = new JButton("B2");
		btnThirstbutton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnThirstbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnThirstbutton);
		
		JButton btnFourthbutton = new JButton("B3");
		btnFourthbutton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(btnFourthbutton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 243, 426, 41);
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setHgap(50);
		contentPane.add(panel_1);
		
		JButton btnOkay = new JButton("Okay");
		btnOkay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnOkay);
		
		JButton btnCacel = new JButton("Cancel");
		btnCacel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnCacel);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnHelp);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(15, 71, 223, 148);
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_2);
		
		JLabel lbltitle = new JLabel("This component has 12-Pixel");
		lbltitle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lbltitle);
		
		JLabel lbltitle1 = new JLabel("margins on left ant top and");
		lbltitle1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lbltitle1);
		
		JLabel lbltitle2 = new JLabel("has 72-Pixel margins on right");
		lbltitle2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lbltitle2);
		
		JLabel lbltitle3 = new JLabel("and bottom");
		lbltitle3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lbltitle3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Columns", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(263, 61, 128, 160);
		FlowLayout flowLayout_3 = (FlowLayout) panel_3.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_3);
		
		JButton btn0 = new JButton("Button0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_3.add(btn0);
		
		JButton btn2 = new JButton("Button1");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_3.add(btn2);
		
		JButton btn3 = new JButton("Button2");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_3.add(btn3);
		
		JButton btn4 = new JButton("Button3");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_3.add(btn4);
	}
}
