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

public class Round1 extends JPanel {

	MainView main;
	
	public Round1(MainView main) {
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

		JMenu mnPer = new JMenu("Permutation");
		menuBar.add(mnPer);
		
		JMenuItem p10 = new JMenuItem("P10");
		p10.setActionCommand("201");
		p10.addActionListener(main);
		mnPer.add(p10);
		
		JMenuItem p8 = new JMenuItem("P8");
		p8.setActionCommand("202");
		p8.addActionListener(main);
		mnPer.add(p8);
		
		JMenuItem ip = new JMenuItem("IP");
		ip.setActionCommand("203");
		ip.addActionListener(main);
		mnPer.add(ip);
		
		JMenuItem IP_1 = new JMenuItem("Inv IP");
		IP_1.setActionCommand("204");
		IP_1.addActionListener(main);
		mnPer.add(IP_1);
		
		JMenuItem E_P = new JMenuItem("E/P");
		E_P.setActionCommand("205");
		E_P.addActionListener(main);
		mnPer.add(E_P);
		
		JMenuItem s0 = new JMenuItem("S0");
		s0.setActionCommand("206");
		s0.addActionListener(main);
		mnPer.add(s0);
		
		JMenuItem s1 = new JMenuItem("S1");
		s1.setActionCommand("207");
		s1.addActionListener(main);
		mnPer.add(s1);
		
		JMenuItem p4 = new JMenuItem("P4");
		p4.setActionCommand("208");
		p4.addActionListener(main);
		mnPer.add(p4);

		JMenuItem LS = new JMenuItem("LS-1");
		LS.setActionCommand("209");
		LS.addActionListener(main);
		mnPer.add(LS);
		
		JLabel lblTitle = new JLabel("The first Round use K1");		
		JPanel panel = new JPanel();
		panel.add(lblTitle);
		panel.setBounds(10, 25, 978, 31);
		panel.setBackground(Color.CYAN);
		add(panel);
		
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("img/Round1.png").getImage().getScaledInstance(280, 350, Image.SCALE_DEFAULT));
		JLabel label = new JLabel("");
		label.setIcon(imageIcon);
		label.setBounds(77, 68, 344, 327);
		add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(674, 91, 144, 21);
		add(panel_1);
		
		JLabel label_1 = new JLabel((String) null);
		panel_1.add(label_1);
		
		JLabel label_16 = new JLabel(main.getValue("plaintext"));
		panel_1.add(label_16);
		
		JLabel lblPlaintext = new JLabel("Plaintext");
		lblPlaintext.setBounds(710, 68, 70, 15);
		add(lblPlaintext);
		
		JLabel label_2 = new JLabel("⬇️");
		label_2.setBounds(739, 115, 15, 15);
		add(label_2);
		
		JLabel lblNewLabel = new JLabel("Apply IP");
		lblNewLabel.setBounds(484, 115, 70, 15);
		add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(674, 134, 144, 21);
		add(panel_2);
		
		JLabel label_17 = new JLabel(main.getValue("IP"));
		panel_2.add(label_17);
		
		JLabel label_4 = new JLabel("⬇️");
		label_4.setBounds(739, 155, 15, 15);
		add(label_4);
		
		JLabel lblApplyEpTo = new JLabel("Apply E/P to 4 Bits IP Right");
		lblApplyEpTo.setBounds(484, 155, 172, 15);
		add(lblApplyEpTo);
		
		JLabel label_6 = new JLabel("⬇️");
		label_6.setBounds(739, 198, 15, 15);
		add(label_6);
		
		JLabel lblXorWithK = new JLabel("XOR with K1");
		lblXorWithK.setBounds(484, 198, 158, 15);
		add(lblXorWithK);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.YELLOW);
		panel_3.setBounds(674, 167, 144, 21);
		add(panel_3);
		
		JLabel label_18 = new JLabel(main.getValue("E_PRound1"));
		panel_3.add(label_18);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.MAGENTA);
		panel_4.setBounds(674, 212, 144, 21);
		add(panel_4);
		
		JLabel label_19 = new JLabel(main.getValue("xorE_PRound1"));
		panel_4.add(label_19);
		
		JLabel label_8 = new JLabel("↙                 ↘    ");
		label_8.setBackground(Color.BLUE);
		label_8.setBounds(701, 238, 117, 15);
		add(label_8);
		
		JLabel lblApplySAnd = new JLabel("Apply S0 and S1 to 4 bits");
		lblApplySAnd.setBounds(484, 238, 189, 15);
		add(lblApplySAnd);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(649, 265, 87, 21);
		add(panel_5);
		
		JLabel lbll = new JLabel(main.getValue("s0Round1"));
		panel_5.add(lbll);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(760, 265, 87, 21);
		add(panel_6);
		
		JLabel lblr = new JLabel(main.getValue("s1Round1"));
		panel_6.add(lblr);
		
		JLabel label_11 = new JLabel("↘                        ↙    ");
		label_11.setBounds(685, 284, 144, 15);
		add(label_11);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(710, 307, 87, 21);
		add(panel_7);
		
		JLabel label_20 = new JLabel(main.getValue("p4Round1"));
		panel_7.add(label_20);
		
		JLabel lblApplyP = new JLabel("Apply P4");
		lblApplyP.setBounds(484, 284, 189, 15);
		add(lblApplyP);
		
		JLabel label_13 = new JLabel("⬇️");
		label_13.setBounds(749, 329, 15, 15);
		add(label_13);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.RED);
		panel_8.setBounds(710, 351, 87, 21);
		add(panel_8);
		
		JLabel lbll_1 = new JLabel(main.getValue("p4XorpT4LRound1"));
		panel_8.add(lbll_1);
		
		JLabel lblApplyXor = new JLabel("Apply Xor with IP 4 Bits Left");
		lblApplyXor.setBounds(484, 329, 202, 15);
		add(lblApplyXor);
		
		JLabel lblNewLabel_1 = new JLabel("IP 4 Bits Right");
		lblNewLabel_1.setBounds(850, 313, 122, 15);
		add(lblNewLabel_1);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.RED);
		panel_9.setBounds(850, 351, 87, 21);
		add(panel_9);
		
		JLabel lblr_1 = new JLabel(main.getValue("pT4Round1"));
		panel_9.add(lblr_1);
		
		JLabel lblFirstRound = new JLabel("First Round");
		lblFirstRound.setBounds(789, 380, 87, 15);
		add(lblFirstRound);
		
		JButton btnNext = new JButton("Next");
		btnNext.setActionCommand("7");
		btnNext.addActionListener(main);
		btnNext.setBounds(185, 463, 117, 25);
		add(btnNext);
		
		JButton button = new JButton("Back");
		button.setActionCommand("5");
		button.addActionListener(main);
		button.setBounds(40, 463, 117, 25);
		add(button);
		
	}

}
