package com.unbosque.views;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTree;
import java.awt.Canvas;
import java.awt.Button;
import javax.swing.JButton;

public class PermutationP10K1 extends JPanel {

	MainView main;

	public PermutationP10K1(MainView main) {
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
		
		JLabel lblTitle = new JLabel("You must permutate key using P10 for calculate K1");		
		JPanel panel = new JPanel();
		panel.add(lblTitle);
		panel.setBounds(10, 25, 978, 31);
		panel.setBackground(Color.CYAN);
		add(panel);
		
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("img/P10.png").getImage().getScaledInstance(280, 200, Image.SCALE_DEFAULT));
		JLabel label = new JLabel("");
		label.setIcon(imageIcon);
		label.setBounds(80, 82, 344, 260);
		add(label);
		
		ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("img/P10Table.png").getImage().getScaledInstance(250, 80, Image.SCALE_DEFAULT));
		JLabel label2 = new JLabel("");
		label2.setIcon(imageIcon2);
		label2.setBounds(80, 327, 334, 92);
		add(label2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(654, 125, 171, 31);
		add(panel_1);
		
		JLabel lblAsd = new JLabel(main.getValue("key"));
		panel_1.add(lblAsd);
		
		JLabel label_1 = new JLabel("⬇️");
		label_1.setBounds(729, 168, 70, 15);
		add(label_1);
		
		JLabel lblKey = new JLabel("Key");
		lblKey.setBounds(715, 98, 70, 15);
		add(lblKey);
		
		JLabel lblApplyP = new JLabel("Apply P10");
		lblApplyP.setBounds(536, 168, 70, 15);
		add(lblApplyP);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(654, 207, 171, 31);
		add(panel_2);
		
		JLabel label_2 = new JLabel(main.getValue("P10"));
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("↙                     ↘");
		label_3.setBounds(681, 250, 118, 15);
		add(label_3);
		
		JLabel label_4 = new JLabel("/5");
		label_4.setBounds(536, 250, 70, 15);
		add(label_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.PINK);
		panel_3.setBounds(610, 284, 107, 31);
		add(panel_3);
		
		JLabel label_5 = new JLabel(main.getValue("P10/5L"));
		panel_3.add(label_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.PINK);
		panel_4.setBounds(758, 284, 107, 31);
		add(panel_4);
		
		JLabel label_6 = new JLabel(main.getValue("P10/5R"));
		panel_4.add(label_6);
		
		JLabel label_7 = new JLabel("⬇️");
		label_7.setBounds(654, 327, 70, 15);
		add(label_7);
		
		JLabel label_8 = new JLabel("⬇️");
		label_8.setBounds(809, 327, 70, 15);
		add(label_8);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(610, 354, 107, 31);
		add(panel_5);
		
		JLabel label_9 = new JLabel(main.getValue("LS1L"));
		panel_5.add(label_9);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(758, 354, 107, 31);
		add(panel_6);
		
		JLabel label_10 = new JLabel(main.getValue("LS1R"));
		panel_6.add(label_10);
		
		JLabel lblNewLabel = new JLabel("LS-1");
		lblNewLabel.setBounds(536, 327, 70, 15);
		add(lblNewLabel);
		
		JLabel label_11 = new JLabel("↘                        ↙    ");
		label_11.setBounds(681, 397, 144, 15);
		add(label_11);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.RED);
		panel_7.setBounds(654, 424, 171, 31);
		add(panel_7);
		
		JLabel label_12 = new JLabel(main.getValue("K1"));
		panel_7.add(label_12);
		
		JLabel lblK = new JLabel("K1");
		lblK.setBounds(729, 463, 70, 21);
		add(lblK);
		
		JButton btnNext = new JButton("Next");
		btnNext.setActionCommand("4");
		btnNext.addActionListener(main);
		btnNext.setBounds(185, 463, 117, 25);
		add(btnNext);
		
		JLabel lblP = new JLabel("Apply P8");
		lblP.setBounds(536, 397, 70, 15);
		add(lblP);
	}
}
