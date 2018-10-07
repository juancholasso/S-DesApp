package com.unbosque.views;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

import com.unbosque.controller.MainController;
import com.unbosque.models.SDes;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

public class MainView implements ActionListener{

	public static final String S_ENCRYPT = "1";
	public static final String S_DECRYPT = "2";
	public static final String S_ENCRYPT_SE = "3";
	public static final String S_CONTINUE_K2 = "4";
	public static final String S_SHOWP = "5";
	public static final String S_ROUNDS1 = "6";
	public static final String S_ROUNDS2 = "7";
	
	public static final String S_KEYS = "101";
	public static final String S_FEISTEL = "102";
	public static final String S_GENERAL= "103";
	
	JFrame frame = null;
	JPanel panel = null;
	SDes sDES;
	
	private StartEncrypt startEncrypt;
	private PermutationP10K1 perP10;
	private CalculateK2 calK2;
	private ShowProcess sp;
	private Round1 r1;
	private Round2 r2;
	/**
	 * Create the application.
	 */
	public MainView() {
		panel = new MainPanel(this);
		frame = new JFrame();
		frame.setSize(1000, 500);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		initialize(panel);
		frame.show();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(JPanel update) {
		panel = update;
		frame.add(update);
	}
	
	/**
	 * Remove panel from Frame
	 */
	public void clear(){
		frame.remove(panel);
	}
	
	/**
	 * Repaint frame
	 */
	public void repaint(){
		frame.repaint();
		frame.validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals(S_ENCRYPT)){
			clear();
			initialize(startEncrypt=new StartEncrypt(this));
			repaint();
		}
		else if(command.equals(S_DECRYPT)){
			
		}
		else if(command.equals(S_ENCRYPT_SE)){
			sDES = new MainController().createSDes(startEncrypt.getPlaintext(), startEncrypt.getKey(), "");
			sDES.encrypt();
			clear();
			initialize(perP10=new PermutationP10K1(this));
			repaint();
		}
		else if(command.equals(S_CONTINUE_K2)){
			clear();
			initialize(calK2=new CalculateK2(this));
			repaint();
		}
		else if(command.equals(S_SHOWP)){
			clear();
			initialize(sp=new ShowProcess(this));
			repaint();
		}
		else if(command.equals(S_ROUNDS1)){
			clear();
			initialize(r1=new Round1(this));
			repaint();
		}
		else if(command.equals(S_ROUNDS2)){
			clear();
			initialize(r2=new Round2(this));
			repaint();
		}
		else if(command.equals(S_KEYS)){
			JDialog keys = new JDialog();
			keys.setLayout(new BorderLayout());
			ImageIcon imageIcon = new ImageIcon(new ImageIcon("img/Keys.png").getImage());
			JLabel label = new JLabel("");
			label.setIcon(imageIcon);
			keys.add(label, BorderLayout.CENTER);
			keys.pack();
			keys.show();
		}
		else if(command.equals(S_FEISTEL)){
			JDialog keys = new JDialog();
			keys.setLayout(new BorderLayout());
			ImageIcon imageIcon = new ImageIcon(new ImageIcon("img/Feistel.png").getImage());
			JLabel label = new JLabel("");
			label.setIcon(imageIcon);
			keys.add(label, BorderLayout.CENTER);
			keys.pack();
			keys.show();
		}
		else if(command.equals(S_GENERAL)){
			JDialog keys = new JDialog();
			keys.setLayout(new BorderLayout());
			ImageIcon imageIcon = new ImageIcon(new ImageIcon("img/General.png").getImage());
			JLabel label = new JLabel("");
			label.setIcon(imageIcon);
			keys.add(label, BorderLayout.CENTER);
			keys.pack();
			keys.show();	
		}
	}
	
	public String getValue(String cKey){
		return sDES.getResults().get(cKey);
	}
}
