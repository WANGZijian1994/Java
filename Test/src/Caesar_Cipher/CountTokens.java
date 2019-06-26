package Caesar_Cipher;

import java.io.*;
import java.util.*;

public class CountTokens {
	
	public static List<String> words(String s){
		List<String>tokens = new ArrayList<String>();
		String token = null;
		if(Character.isLetter(s.charAt(0))){token = Character.toString(s.charAt(0));}
		for(int i = 1;i<s.length()-1;i++) {
			char ch = s.charAt(i);
			if(i==s.length()-2){
				if(Character.isLetter(ch)) {
					token+=ch;
				}
				char fin = s.charAt(i+1);
				if(Character.isLetter(fin)){
					token+=fin;
				}
				tokens.add(token);
			}	
			if(Character.isLetter(ch)){
				token+=ch;
			}
			else if(Character.isLetter(s.charAt(i-1)) && Character.isLetter(s.charAt(i+1)) && (ch!=' ')) {
				token+=ch;
			}
			else{
				if(token.length()>0){
					tokens.add(token);
					token = "";
				}
			}
		}
		return tokens;
	}
	
	public static List<Integer> length_of_word(List<String> l){
		List<Integer> length = new ArrayList<Integer>();
		for(int i = 0;i<l.size();i++) {
			String token = l.get(i);
			length.add(token.length());
		}
		return length;
	}
	
	public static Map<String,Integer> Stats(List<Integer>l){
		Map<String,Integer>m = new HashMap<String,Integer>();
		int counter = 1;
		for(int i =1;i<l.size()-1;i++) {
			if(i==l.size()-2) {
				if(l.get(i)==l.get(i+1)) {
					counter++;
					String s = Integer.toString(l.get(i));
					m.put(s,++counter);
				}
				else {
					String s = Integer.toString(l.get(i));
					m.put(s,counter);
					String s1 = Integer.toString(l.get(i+1));
					m.put(s1, 1);
				}
			}
			if(l.get(i-1)==l.get(i)) {
				counter++;
			}
			else {
				System.out.println(l.get(i-1)+" --- "+l.get(i));
				String s = Integer.toString(l.get(i-1));
				m.put(s, counter);
				counter=1;
			}
		}
		return m;
	}

	public static void main(String[] args) {
		//"caesar.txt","errors.txt","hamlet.txt","likeit.txt","macbeth.txt",
		String[] play = {"romeo.txt"};
		String total_info = "";
		BufferedReader reader = null;
		try{
			for(int i = 0;i<play.length;++i) {
				String info = "";
				String filename = play[i];
				File file = new File("/Users/zijian/ZijianJava/CommonWordsData/romeo.txt");
				reader = new BufferedReader(new FileReader(file));
				while((info=reader.readLine())!=null) {
					total_info+=info;
				}
			}
			reader.close();
		}
		catch(Exception e) {e.printStackTrace();}
		List<String>l = words(total_info);
		List<Integer>Statistiques = length_of_word(l);
		//System.out.println("1 : "+Statistiques);
		Collections.sort(Statistiques);
		//System.out.println(Statistiques);
		System.out.println(Stats(Statistiques));
	}
}
