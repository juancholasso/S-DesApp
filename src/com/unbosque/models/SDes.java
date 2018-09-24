package com.unbosque.models;

import java.util.HashMap;
import com.unbosque.models.TablesPermutation;
/**
 * 
 * @author Juan Pablo Camargo Lasso (juancholasso)
 * @author Samuel Delgado Muñoz
 * @Reference http://mercury.webster.edu/aleshunas/COSC%205130/G-SDES.pdf
 *
 */
/*
 * S-Des Encryption and Decryption
 */
public class SDes {
	
	private String plaintext;
	private String ciphertext;
	private String key;
	private String k1;
	private String k2;
	private HashMap<String, String> results;

	public SDes(String plaintext, String key, String ciphertext) {
		results = new HashMap<>();
		this.plaintext = plaintext;
		this.ciphertext = ciphertext;
		this.key = key;	
	}
	
	public HashMap<String, String> getResults(){
		return results;
	}
	
	public void generateKeys(){
		//Apply permutation P10
		String keyP10 = permutation(key,TablesPermutation.P10);
		results.put("P10", keyP10);
		//Apply LS-1
		String ls1L = leftShift(keyP10.substring(0,5),1);
		String ls1R = leftShift(keyP10.substring(5,10),1);
		results.put("LS1L", ls1L);
		results.put("LS1R", ls1R);
		//Apply P8 (K1)
		k1 = permutation(ls1L+ls1R, TablesPermutation.P8);
		results.put("K1", k1);
		//Apply LS-2
		String ls2L = leftShift(ls1L,2);
		String ls2R = leftShift(ls1R,2);
		results.put("LS2L", ls2L);
		results.put("LS2R", ls2R);
		//Apply P8 (K2)
		k2 = permutation(ls2L+ls2R, TablesPermutation.P8);
		results.put("K2", k2);
	}
	
	//The i-1 is because the array start in 0
	public String permutation(String key, int[] tablePermutation){
		int[] P10 = tablePermutation;
		char[] keyArray = key.toCharArray();
		String result = "";
		for(int i = 0; i<P10.length; i++){
			result+=keyArray[P10[i]-1];
		}
		return result;
	}
	
	/**
	 * 
	 * @param key 5 bits
	 * @param num_bits to shift left
	 * @return key shifted
	 */
	public String leftShift(String key, int num_bits){
		return key.substring(num_bits, key.length())+key.substring(0, num_bits);
	}
}
