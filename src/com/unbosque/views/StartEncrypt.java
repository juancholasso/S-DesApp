package com.unbosque.views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class StartEncrypt extends JPanel implements ActionListener{
	
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnEncrypt;
	private MainView main;
	private String key;
	private String plaintext;
	private JButton button;
	
	public static final String S_ENCRYPT = "1";
	public static final String S_BACK = "2";
	public static final String S_ENCRYPT_SE = "3";
	/**
	 * Create the panel.
	 */
	public StartEncrypt(MainView main) {
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
		
		JLabel lblTitle = new JLabel("First, you must insert the key and plaintext");		
		JPanel panel = new JPanel();
		panel.add(lblTitle);
		panel.setBounds(10, 25, 978, 31);
		panel.setBackground(Color.CYAN);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(298, 136, 130, 31);
		add(panel_1);
		
		JLabel lblKeyBits = new JLabel("Key (10 bits)");
		panel_1.add(lblKeyBits);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(298, 197, 130, 31);
		add(panel_2);
		
		JLabel lblPlaintextBits = new JLabel("Plaintext (8 bits)");
		panel_2.add(lblPlaintextBits);
		
		textField = new JTextField();
		textField.setBounds(520, 136, 130, 31);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(520, 197, 130, 31);
		add(textField_1);
		
		btnEncrypt = new JButton("Encrypt");
		btnEncrypt.setBounds(411, 315, 117, 25);
		btnEncrypt.addActionListener(this);
		btnEncrypt.setActionCommand(S_ENCRYPT);
		add(btnEncrypt);
		
		button = new JButton("Back");
		button.setActionCommand("2");
		button.addActionListener(this);
		button.setBounds(40, 463, 117, 25);
		add(button);
	}

	public String getKey(){
		return key;
	}
	
	public String getPlaintext(){
		return plaintext;
	}

	@Override
	public void actionPerformed(ActionEvent e){
		String command = e.getActionCommand();
		if(command.equals(S_ENCRYPT)){
			if(textField.getText().length() != 10){
				JOptionPane.showMessageDialog(null, "The key must be of length 10" , "Error", JOptionPane.WARNING_MESSAGE);
			}
			else if(textField_1.getText().length() != 8){
				JOptionPane.showMessageDialog(null, "The plaintext must be of length 10" , "Error", JOptionPane.WARNING_MESSAGE);
			}
			else if(!textField.getText().matches("^([1]|[0])+$")){
				JOptionPane.showMessageDialog(null, "The key should only contain 1 or 0. (Binary Number)" , "Error", JOptionPane.WARNING_MESSAGE);
			}
			else if(!textField_1.getText().matches("^([1]|[0])+$")){
				JOptionPane.showMessageDialog(null, "The plaintext should only contain 1 or 0. (Binary Number)" , "Error", JOptionPane.WARNING_MESSAGE);

			}
			else{
				key = textField.getText();
				plaintext = textField_1.getText();
				btnEncrypt.setActionCommand(S_ENCRYPT_SE);
				btnEncrypt.removeActionListener(this);
				btnEncrypt.addActionListener(main);
				btnEncrypt.doClick();
			}
		}
		else if(command.equals(S_BACK)){
			button.setActionCommand("0");
			button.removeActionListener(this);
			button.addActionListener(main);
			button.doClick();
		}
	}
}
