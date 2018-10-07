package com.unbosque.controller;

import com.unbosque.models.SDes;
import com.unbosque.views.MainView;

public class MainController {
	
	public MainController() {
	}
	
	public static void main(String[] args) {
		MainView view = new MainView();
	}
	
	public SDes createSDes(String plaintext, String key, String ciphertext){
		return new SDes(plaintext, key, ciphertext);
	}
}
