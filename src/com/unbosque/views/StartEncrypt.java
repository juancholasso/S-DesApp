package com.unbosque.views;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class StartEncrypt extends JPanel {

	/**
	 * Create the panel.
	 */
	public StartEncrypt() {
		this.setSize(1000, 500);
		setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 988, 21);
		add(menuBar);
		
		JMenu mnSdes = new JMenu("S-DES");
		menuBar.add(mnSdes);
		
		JMenuItem mntmKeys = new JMenuItem("Keys");
		mnSdes.add(mntmKeys);
		
		JMenuItem mntmFeistel = new JMenuItem("Feistel");
		mnSdes.add(mntmFeistel);
		
		JMenuItem mntmGeneral = new JMenuItem("General");
		mnSdes.add(mntmGeneral);
		
		JLabel lblLearnSdes = new JLabel("asdsadsad");
		lblLearnSdes.setBounds(378, 64, 111, 15);
		add(lblLearnSdes);
	}

}
