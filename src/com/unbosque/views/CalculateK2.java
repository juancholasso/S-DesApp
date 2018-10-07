package com.unbosque.views;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class CalculateK2 extends JPanel {

	MainView main;
	
	public CalculateK2(MainView main) {
		this.main = main;

		this.setSize(1000, 500);
		setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 988, 21);
		add(menuBar);

		JMenu mnSdes = new JMenu("S-DES");
		menuBar.add(mnSdes);
		
		JMenuItem mntmKeys = new JMenuItem("Keys");
		mntmKeys.setActionCommand("101");
		mntmKeys.addActionListener(main);
		mnSdes.add(mntmKeys);
		
		JMenuItem mntmFeistel = new JMenuItem("Feistel");
		mntmFeistel.setActionCommand("102");
		mntmFeistel.addActionListener(main);
		mnSdes.add(mntmFeistel);
		
		JMenuItem mntmGeneral = new JMenuItem("General");
		mntmGeneral.setActionCommand("103");
		mntmGeneral.addActionListener(main);
		mnSdes.add(mntmGeneral);
		
		JLabel lblTitle = new JLabel("With LS-1 from K1 you can calculate K2");		
		JPanel panel = new JPanel();
		panel.add(lblTitle);
		panel.setBounds(10, 25, 978, 31);
		panel.setBackground(Color.CYAN);
		add(panel);
		
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("img/P10K2.png").getImage().getScaledInstance(280, 350, Image.SCALE_DEFAULT));
		JLabel label = new JLabel("");
		label.setIcon(imageIcon);
		label.setBounds(77, 68, 344, 327);
		add(label);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(602, 116, 107, 31);
		add(panel_5);
		
		JLabel label_9 = new JLabel(main.getValue("LS1L"));
		panel_5.add(label_9);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(779, 116, 107, 31);
		add(panel_6);
		
		JLabel label_10 = new JLabel(main.getValue("LS1R"));
		panel_6.add(label_10);
		
		JLabel lblLs = new JLabel("LS-1");
		lblLs.setBounds(719, 91, 70, 15);
		add(lblLs);
		
		JLabel label_1 = new JLabel("⬇️");
		label_1.setBounds(650, 159, 15, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("⬇️");
		label_2.setBounds(824, 159, 70, 15);
		add(label_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(602, 192, 107, 31);
		add(panel_1);
		
		JLabel label_3 = new JLabel(main.getValue("LS2L"));
		panel_1.add(label_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		panel_2.setBounds(779, 192, 107, 31);
		add(panel_2);
		
		JLabel label_4 = new JLabel(main.getValue("LS2R"));
		panel_2.add(label_4);
		
		JLabel lblLs_1 = new JLabel("LS-2");
		lblLs_1.setBounds(514, 159, 70, 15);
		add(lblLs_1);
		
		JLabel label_5 = new JLabel("↘                        ↙    ");
		label_5.setBounds(677, 235, 144, 15);
		add(label_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GREEN);
		panel_3.setBounds(665, 273, 144, 31);
		add(panel_3);
		
		JLabel label_6 = new JLabel(main.getValue("K2"));
		panel_3.add(label_6);
		
		JLabel lblApplyP = new JLabel("Apply P8");
		lblApplyP.setBounds(514, 235, 70, 15);
		add(lblApplyP);
		
		JLabel lblK = new JLabel("K2");
		lblK.setBounds(728, 310, 32, 15);
		add(lblK);
		
		JButton btnNext = new JButton("Next");
		btnNext.setActionCommand("5");
		btnNext.addActionListener(main);
		btnNext.setBounds(185, 463, 117, 25);
		add(btnNext);
	}

}
