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

public class ShowProcess extends JPanel {

	MainView main;
	
	public ShowProcess(MainView main) {
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
		
		JLabel lblTitle = new JLabel("For encrypt the plaintext, you must make two rounds using K1, K2 and feistel function");		
		JPanel panel = new JPanel();
		panel.add(lblTitle);
		panel.setBounds(10, 25, 978, 31);
		panel.setBackground(Color.CYAN);
		add(panel);
		
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("img/Encryption.png").getImage().getScaledInstance(200, 350, Image.SCALE_DEFAULT));
		JLabel label = new JLabel("");
		label.setIcon(imageIcon);
		label.setBounds(418, 90, 373, 361);
		add(label);
		
		JButton btnNext = new JButton("Next");
		btnNext.setActionCommand("6");
		btnNext.addActionListener(main);
		btnNext.setBounds(185, 463, 117, 25);
		add(btnNext);
		
		JButton button = new JButton("Back");
		button.setActionCommand("4");
		button.addActionListener(main);
		button.setBounds(40, 463, 117, 25);
		add(button);
	}

}
