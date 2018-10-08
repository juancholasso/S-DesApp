package com.unbosque.views;

import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class MainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainPanel(MainView main) {
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
		
		JLabel lblLearnSdes = new JLabel("LEARN S-DES");
		lblLearnSdes.setBounds(412, 67, 111, 15);
		add(lblLearnSdes);
		
		JButton btnStartEncrypt = new JButton("Start Decrypt");
		btnStartEncrypt.setBounds(540, 229, 160, 25);
		btnStartEncrypt.setActionCommand(MainView.S_DECRYPT);
		btnStartEncrypt.addActionListener(main);
		add(btnStartEncrypt);
		
		JButton btnStartDecrypt = new JButton("Start Encrypt");
		btnStartDecrypt.setBounds(232, 229, 160, 25);
		btnStartDecrypt.setActionCommand(MainView.S_ENCRYPT);
		btnStartDecrypt.addActionListener(main);
		add(btnStartDecrypt);
		
		//ImageIcon imageIcon = new ImageIcon("img/UEBlogo.png"); // load the image to a imageIcon
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("img/UEBlogo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		JLabel label = new JLabel("");
		label.setIcon(imageIcon);
		label.setBounds(412, 336, 237, 122);
		add(label);
		
		JLabel lblSemilleroSeguridadInformatica = new JLabel("Semillero Seguridad Informatica - Unbosque 2018");
		lblSemilleroSeguridadInformatica.setBounds(0, 485, 382, 15);
		add(lblSemilleroSeguridadInformatica);
		
	}
}
