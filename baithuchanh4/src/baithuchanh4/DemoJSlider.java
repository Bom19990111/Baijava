package baithuchanh4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JSlider;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class DemoJSlider extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoJSlider frame = new DemoJSlider();
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
	public DemoJSlider() {
		setTitle("Demo Slide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 23, 347, 440);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(30);
		flowLayout.setHgap(50);
		contentPane.add(panel);
		
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setForeground(Color.BLUE);
		slider.setMinorTickSpacing(5);
		slider.setFont(new Font("Tahoma", Font.PLAIN, 15));
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(50);
		slider.setMaximum(250);
		slider.setPaintTicks(true);
		panel.add(slider);
		
		JSlider slider_1 = new JSlider();
		slider_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		slider_1.setMajorTickSpacing(50);
		slider_1.setPaintTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setMinorTickSpacing(5);
		slider_1.setMaximum(250);
		slider_1.setValue(250);
		panel.add(slider_1);
		
		JSlider slider_2 = new JSlider();
		slider_2.setMinorTickSpacing(5);
		slider_2.setValue(0);
		slider_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		slider_2.setPaintTicks(true);
		slider_2.setPaintLabels(true);
		slider_2.setMaximum(250);
		slider_2.setMajorTickSpacing(50);
		panel.add(slider_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(367, 23, 534, 440);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Tran Nhat Thinh\\Dowload-hinh-nen-cua-Macbook-Mac-macOS-8.jpg"));
		panel_1.add(lblNewLabel);
	}

}
