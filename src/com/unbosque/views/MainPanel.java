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
		
		JLabel lblLearnSdes = new JLabel("LEARN S-DES");
		lblLearnSdes.setBounds(378, 64, 111, 15);
		add(lblLearnSdes);
		
		JButton btnStartEncrypt = new JButton("Start Decrypt");
		btnStartEncrypt.setBounds(502, 229, 160, 25);
		btnStartEncrypt.setActionCommand(MainView.S_DECRYPT);
		btnStartEncrypt.addActionListener(main);
		add(btnStartEncrypt);
		
		JButton btnStartDecrypt = new JButton("Start Encrypt");
		btnStartDecrypt.setBounds(199, 229, 160, 25);
		btnStartDecrypt.setActionCommand(MainView.S_ENCRYPT);
		btnStartDecrypt.addActionListener(main);
		add(btnStartDecrypt);
		
		//ImageIcon imageIcon = new ImageIcon("img/UEBlogo.png"); // load the image to a imageIcon
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("img/UEBlogo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		JLabel label = new JLabel("");
		label.setIcon(imageIcon);
		label.setBounds(378, 310, 237, 122);
		add(label);
		
		JLabel lblSemilleroSeguridadInformatica = new JLabel("Semillero Seguridad Informatica - Unbosque 2018");
		lblSemilleroSeguridadInformatica.setBounds(0, 485, 382, 15);
		add(lblSemilleroSeguridadInformatica);
		
	}
}
