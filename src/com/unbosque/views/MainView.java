package com.unbosque.views;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class MainView implements ActionListener{

	public static final String S_ENCRYPT = "1";
	public static final String S_DECRYPT = "2";
	JFrame frame = null;
	JPanel panel = null;

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
			initialize(new StartEncrypt());
			repaint();
		}
	}
	
}
