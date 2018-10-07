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
		btnNext.setBounds(457, 463, 117, 25);
		add(btnNext);
	}

}
