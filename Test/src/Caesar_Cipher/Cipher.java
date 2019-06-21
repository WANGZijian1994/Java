package Caesar_Cipher;

import java.util.*;

public class Cipher{
	
	private String code = "XYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private Map<Character,Character> Encrypte_code = new HashMap<Character,Character>();
	private Map<Character,Character> Decrypte_code = new HashMap<Character,Character>();
	
	public Cipher() {
		for(int i = 0;i<code.length();i++){
			if(i<=22) {
				Encrypte_code.put(code.charAt(i),code.charAt(i+3));
				Decrypte_code.put(code.charAt(i+3), code.charAt(i));
			}
			else{
				Encrypte_code.put(code.charAt(i-23),code.charAt(i));
				Decrypte_code.put(code.charAt(i),code.charAt(i-23));
			}
		}
		Encrypte_code.put(' ', ' ');
		Decrypte_code.put(' ', ' ');
	}
	
	public String Encryption1(String s){
		String s1 = "After Encryption : ";
		for(int i = 0;i<s.length();i++) {
			s1+=Encrypte_code.get(s.charAt(i));
		}
		return s1;
	}
	
	public String Decryption1(String s) {
		String s1 = "After Decryption : ";
		for(int i = 0;i<s.length();i++){
			s1+=Decrypte_code.get(s.charAt(i));
		}
		return s1;
	}

	public static void main(String[] args) {
		Cipher c1 = new Cipher();
		System.out.println("Encryption for ABK : "+c1.Encryption1("ABK"));
	}
}
