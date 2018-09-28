package com.unbosque.controller;

import java.util.HashMap;

import javax.swing.JFileChooser;

import com.unbosque.models.SDes;
import com.unbosque.models.TablesPermutation;
import com.unbosque.views.MainView;

public class MainController {
	
	
	public static void main(String[] args) {
		SDes prueba = new SDes("00000000","0000000000","");
		prueba.encrypt();
//		SDes prueba = new SDes("","0111010001","01110011");
//		prueba.decrypt();
		HashMap<String, String> res = prueba.getResults();
//		System.out.println("k1  "+ res.get("K1"));
//		System.out.println("k2  "+res.get("K2"));
//		System.out.println("ls1R  "+res.get("LS1R"));
//		System.out.println("ls1L  "+res.get("LS1L"));
//		System.out.println("ls2R  "+res.get("LS2R"));
//		System.out.println("ls2L  "+res.get("LS2L"));
//		//MainView view = new MainView();
//		//System.out.println("Ciphertext  " + res.get("ciphertext"));
//		System.out.println("plaintext  " + res.get("plaintext"));
		System.out.println(res.values());
	}
}
