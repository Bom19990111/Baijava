package baithuchanh2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Caculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caculator frame = new Caculator();
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
	public Caculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Caculator");
		
		JTextArea txtrCacul = new JTextArea();
		txtrCacul.setBounds(91, 10, 253, 47);
		txtrCacul.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 31));
		txtrCacul.setBackground(UIManager.getColor("Button.background"));
		txtrCacul.setForeground(new Color(255, 0, 51));
		txtrCacul.setText("CACULATOR");
		contentPane.add(txtrCacul);
		
		textField = new JTextField();
		textField.setBounds(10, 67, 358, 55);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(30);
		flowLayout.setHgap(14);
		panel.setBounds(10, 132, 358, 273);
		contentPane.add(panel);
		
		JButton btnnumber1 = new JButton("1");
		btnnumber1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnnumber1);
		
		JButton btnnumber2 = new JButton("2");
		btnnumber2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnnumber2);
		
		JButton btnnumber3 = new JButton("3");
		btnnumber3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnnumber3);
		
		JButton btnsum = new JButton("+");
		btnsum.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnsum);
		
		JButton btnpercent = new JButton("%");
		btnpercent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnpercent);
		
		JButton btnnumber4 = new JButton("4");
		btnnumber4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnnumber4);
		
		JButton btnnumber5 = new JButton("5");
		btnnumber5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnnumber5);
		
		JButton btnnumber6 = new JButton("6");
		btnnumber6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnnumber6);
		
		JButton btnminus = new JButton("-");
		btnminus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnminus);
		
		JButton btnsqrt = new JButton("sqrt");
		btnsqrt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnsqrt);
		
		JButton btnnumber7 = new JButton("7");
		btnnumber7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnnumber7);
		
		JButton btnnumber8 = new JButton("8");
		btnnumber8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnnumber8);
		
		JButton btnnumber9 = new JButton("9");
		btnnumber9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnnumber9);
		
		JButton btnmultiphy = new JButton("*");
		btnmultiphy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnmultiphy);
		
		JButton btnfactor = new JButton("1/x");
		btnfactor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnfactor);
		
		JButton btnzero = new JButton("0");
		btnzero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnzero);
		
		JButton btncomma = new JButton(".");
		btncomma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btncomma);
		
		JButton btnequalsign = new JButton("=");
		btnequalsign.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnequalsign);
		
		JButton btndivisor = new JButton("/");
		btndivisor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btndivisor);
		
		JButton btncancel = new JButton("C");
		btncancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btncancel);
	}
}
