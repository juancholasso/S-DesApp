package com.unbosque.models;

import java.util.HashMap;
import com.unbosque.models.TablesPermutation;
/**
 * 
 * @author Juan Pablo Camargo Lasso (juancholasso)
 * @author Samuel Delgado Muñoz (samudm98)
 * @Reference http://mercury.webster.edu/aleshunas/COSC%205130/G-SDES.pdf
 * Universidad El Bosque
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
		generateKeys();
	}
	
	public HashMap<String, String> getResults(){
		return results;
	}
	
	/**
	 * Generate K1 and K2 and save the results in HashMap -> results
	 * Also saves the results of all phases
	 */
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
	
	/**
	 * Encrypt plaintext
	 * @return
	 */
	public void encrypt(){
		results.put("plaintext", plaintext);
		//Apply IP to plaintext
		String IP = permutation(plaintext, TablesPermutation.IP);
		results.put("IP", IP);
		//Apply feistel to pTIP - first round with k1
		String feistelK1 = feistel(IP, k1, 1);
		results.put("feistelK1", feistelK1);
		//Apply swap to feistelK1
		String swap = swap(feistelK1);
		results.put("swap", swap);
		//Apply feistel to swap - second round with k2
		String feistelK2 = feistel(swap, k2, 2);
		results.put("feistelK2", feistelK2);
		//Apply inverseIP (IP^-1) to feistelK2
		ciphertext = permutation(feistelK2, TablesPermutation.INVERSE_IP);
		results.put("ciphertext", ciphertext);
	}
	
	/**
	 * Decrypt ciphertext
	 * @return
	 */
	public void decrypt(){
		//Apply IP to ciphertext
		String IP = permutation(ciphertext, TablesPermutation.IP);
		results.put("IP", IP);
		//Apply feistel to swap - first round with k2
		String feistelK2 = feistel(IP, k2, 1);
		results.put("feistelK2", feistelK2);
		//Apply swap to feistelK2
		String swap = swap(feistelK2);
		results.put("swap", swap);
		//Apply feistel to swap - second round with k1
		String feistelK1 = feistel(swap, k1, 2);
		results.put("feistelK1", feistelK1);
		//Apply inverseIP (IP^-1) to feistelK1
		plaintext = permutation(feistelK1, TablesPermutation.INVERSE_IP);
		results.put("plaintext", plaintext);
	}
	
	/**
	 * @return Key Permuted
	 */
	//The i-1 is because the array start in 0
	public String permutation(String text, int[] tablePermutation){
		char[] keyArray = text.toCharArray();
		String result = "";
		for(int i = 0; i<tablePermutation.length; i++){
			result+=keyArray[tablePermutation[i]-1];
		}
		return result;
	}
	
	/**
	 * Return result for permutation with s0 or s1
	 * @return value of matrix in the position [row][column]
	 */
	public int permutationMatrixS(int row, int column, int[][] matrixPermutation){
		return matrixPermutation[row][column];
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
	
	/**
	 * Function Feistel
	 * @param plaintext8b -> Plaintext 8 bits
	 * @param k -> Key
	 */
	public String feistel(String plaintext8b, String k, int round){
		//Divide plaintext in blocks of 4 bits
		String pT4L = plaintext8b.substring(0,4);//Left
		String pT4R = plaintext8b.substring(4,8);//Rigth
		results.put("pT4LRound"+round, pT4L);
		results.put("pT4Round"+round, pT4R);
		//Apply E/P to pT4R	
		String E_P = permutation(pT4R, TablesPermutation.E_P);
		results.put("E_PRound"+round, E_P);
		//Apply XOR with K1 or K2 according to the round
		String xorE_P = xor(E_P, k);
		results.put("xorE_PRound"+round, xorE_P);
		//Divide xorE_P in blocks of 4 bytes
		String xorE_P4L = xorE_P.substring(0,4);//Left
		String xorE_P4R = xorE_P.substring(4,8);//Rigth
		results.put("xorE_P4LRound"+round, xorE_P4L);
		results.put("xorE_P4RRound"+round, xorE_P4R);
		//Apply S0 to xorE_P4L
		int xorE_P4Lrow = Integer.parseInt(xorE_P4L.charAt(0)+""+xorE_P4L.charAt(3), 2); //ROW
		int xorE_P4Lcol = Integer.parseInt(xorE_P4L.charAt(1)+""+xorE_P4L.charAt(2), 2); //COLUMN
		int s0Int = permutationMatrixS(xorE_P4Lrow, xorE_P4Lcol, TablesPermutation.S0);	//ToBinary
		String s0 = completeBytes(Integer.toBinaryString(s0Int),2);
		results.put("xorE_P4LrowRound"+round, ""+xorE_P4Lrow);
		results.put("xorE_P4LcolRound"+round, ""+xorE_P4Lcol);
		results.put("s0IntRound"+round, ""+s0Int);
		results.put("s0Round"+round, s0);
		//Apply S0 to xorE_P4R
		int xorE_P4Rrow = Integer.parseInt(xorE_P4R.charAt(0)+""+xorE_P4R.charAt(3), 2); //ROW
		int xorE_P4Rcol = Integer.parseInt(xorE_P4R.charAt(1)+""+xorE_P4R.charAt(2), 2); //COLUMN
		int s1Int = permutationMatrixS(xorE_P4Rrow, xorE_P4Rcol, TablesPermutation.S1);	//ToBinary
		String s1 = completeBytes(Integer.toBinaryString(s1Int),2);
		results.put("xorE_P4RrowRound"+round, ""+xorE_P4Rrow);
		results.put("xorE_P4RcolRound"+round, ""+xorE_P4Rcol);
		results.put("s1IntRound"+round, ""+s1Int);
		results.put("s1Round"+round, s1);
		//Apply P4 to result of concatenation between s0 and s1
		String p4 = permutation(s0+""+s1, TablesPermutation.P4);
		results.put("p4Round"+round, p4);
		//Apply Xor between p4 and pT4L
		String p4XorpT4L = xor(p4, pT4L);
		results.put("p4XorpT4LRound"+round, p4XorpT4L);
		return (p4XorpT4L+""+pT4R);
	}
	
	/**
	 * Return result xor operation between a and b
	 */
	public String xor(String a, String b){
		int a_int = Integer.parseInt(a,2);
		int b_int = Integer.parseInt(b,2);
		int resXor = (a_int^b_int);
		return completeBytes(""+Integer.toBinaryString(resXor), a.length());
	}
	
	/**
	 * Return a binary number with previous zeroes
	 */
	public String completeBytes(String bytes, int size){
		String result = bytes;
		for(int i = bytes.length(); i<size; i++){
			result = "0"+result;
		}
		return result;
	}
	
	/**
	 * Return swap from text : 10011101 -> Swap -> 11011001
	 */
	public String swap(String text){
		return text.substring(text.length()/2,text.length())+text.substring(0, text.length()/2);
	}
}
