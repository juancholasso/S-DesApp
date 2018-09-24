package com.unbosque.controller;

import java.util.HashMap;

import com.unbosque.models.SDes;

public class MainController {
	
	
	public static void main(String[] args) {
		SDes prueba = new SDes("","1011011101","");
		prueba.generateKeys();
		HashMap<String, String> res = prueba.getResults();
		System.out.println("k1  "+ res.get("K1"));
		System.out.println("k2  "+res.get("K2"));
		System.out.println("ls1R  "+res.get("LS1R"));
		System.out.println("ls1L  "+res.get("LS1L"));
		System.out.println("ls2R  "+res.get("LS2R"));
		System.out.println("ls2L  "+res.get("LS2L"));
	}
}
