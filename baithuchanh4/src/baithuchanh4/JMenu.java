package baithuchanh4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenu frame = new JMenu();
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
	public JMenu() {
		setTitle("Hoc Java: Desktop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 10, 626, 32);
		contentPane.add(menuBar);
		
		javax.swing.JMenu mnNewMenu = new javax.swing.JMenu("FILE");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New");
		mntmNewMenuItem.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\settingdefault.png"));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Open File");
		mntmNewMenuItem_1.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\Folder-icon.png"));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Save");
		mntmNewMenuItem_2.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\save-icon.png"));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		javax.swing.JMenu EDIT = new javax.swing.JMenu("EDIT");
		EDIT.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(EDIT);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Cut");
		mntmNewMenuItem_3.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\cut-icon.png"));
		EDIT.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Copy");
		mntmNewMenuItem_4.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\copy-icon.png"));
		EDIT.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Delete");
		mntmNewMenuItem_5.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\Button-Close-icon.png"));
		EDIT.add(mntmNewMenuItem_5);
		
		javax.swing.JMenu mnNewMenu_2 = new javax.swing.JMenu("SETTINGS");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_2);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("Turn off lound");
		mnNewMenu_2.add(rdbtnmntmNewRadioItem);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_2 = new JCheckBoxMenuItem("Turn up the lound");
		mnNewMenu_2.add(chckbxmntmNewCheckItem_2);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_3 = new JCheckBoxMenuItem("Turn down the lound");
		mnNewMenu_2.add(chckbxmntmNewCheckItem_3);
		
		javax.swing.JMenu mnNewMenu_3 = new javax.swing.JMenu("WINDOW");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_3);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Appearecent");
		mnNewMenu_3.add(chckbxmntmNewCheckItem);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("Editor");
		mnNewMenu_3.add(chckbxmntmNewCheckItem_1);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("Show view");
		mnNewMenu_3.add(rdbtnmntmNewRadioItem_1);
		
		javax.swing.JMenu mnNewMenu_4 = new javax.swing.JMenu("HELP");
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Search");
		mntmNewMenuItem_8.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\Actions-edit-find-icon.png"));
		mnNewMenu_4.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Welcome");
		mntmNewMenuItem_10.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\welcome-icon.png"));
		mnNewMenu_4.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Donate");
		mntmNewMenuItem_9.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\Election-Donate-Outline-icon.png"));
		mnNewMenu_4.add(mntmNewMenuItem_9);
		
		javax.swing.JMenu mnNewMenu_5 = new javax.swing.JMenu("WELCOME");
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Log in");
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form frame = new Form();
				frame.setVisible(true);
			}
		});
		mntmNewMenuItem_14.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\log-in_icon-icons.com_50107.png"));
		mnNewMenu_5.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Log out");
		mntmNewMenuItem_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(rootPane, "Đăng xuất thành công");
			}
		});
		mntmNewMenuItem_15.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\log-out_icon-icons.com_50106 (1).png"));
		mnNewMenu_5.add(mntmNewMenuItem_15);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 52, 626, 55);
		contentPane.add(toolBar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\among_us_instagram_icon_156925.png"));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\among_us_twitter_icon_156932.png"));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\r\n");
		btnNewButton_2.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\among_us_netflix_icon_156927.png"));
		toolBar.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 134, 606, 154);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("JPopup");
		lblNewLabel_1.setToolTipText("\u0110\u1EEBng nh\u1EA5n, l\u1ED7i \u0111\u1EA5y");
		lblNewLabel_1.setBounds(278, 22, 89, 35);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel.add(lblNewLabel_1);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(lblNewLabel_1, popupMenu);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Popup1");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("Popup1");
			}
		});
		popupMenu.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Popup2");
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("Popup2");
			}
		});
		popupMenu.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Popup3");
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("Popup3");
			}
		});
		popupMenu.add(mntmNewMenuItem_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 214, 134);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\L\u1EACP TR\u00CCNH DESKTOP\\ICON\\037_Pikachu_icon-icons.com_67297.png"));
		panel_1.add(lblNewLabel);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
