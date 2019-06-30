package ListMethods;

import java.util.*;
import java.io.*;

public class WordFrequency {
	
	private List<String>myWords = new ArrayList<String>();
	private List<String>myUniqueWords = new ArrayList<String>();
	private List<Integer>myFreqs = new ArrayList<Integer>();
	private String[] punctuations = {":",".",";","!","?","[","]","\""};
	private Map<String,Integer>Stats = new HashMap<String,Integer>();
	
	public WordFrequency(String words) {
		String word = new String();
		for(int i = 0;i<words.length();i++) {
			char ch = words.toLowerCase().charAt(i);
			/*
			if(isPunctuation(ch)) {
				continue;
			}
			*/
			if(ch!=' ') {
				word+=ch;
			}
			
			else{
				myWords.add(word);
				word=new String();
			}
			
			if(i==words.length()-1) {
				myWords.add(word);
			}
		}
	}
	
	public boolean isPunctuation(char ch) {
		int counter = 0;
		for(int i = 0;i < punctuations.length;++i){
			if(punctuations[i].equals(Character.toString(ch))) {
				counter++;
			}
		}
		return counter!=0;
	}
	
	public void Statistiques(){
		for(int i = 0;i < myWords.size();++i){
			String w = myWords.get(i);
			if((w!=" ")&&(!myUniqueWords.contains(w))){
				myUniqueWords.add(w);
			}
		}
		for(int i = 0;i<myUniqueWords.size();++i) {
			myFreqs.add(Collections.frequency(myWords, myUniqueWords.get(i)));
		}
		
		System.out.println(myUniqueWords.size());
		System.out.println(myFreqs.size());
		for(int i = 0;i<myUniqueWords.size();++i){
			System.out.println(myUniqueWords.get(i) + "---" + myFreqs.get(i));
		}
		System.out.println(myFreqs);
	}
	
	

	public static void main(String[] args) {
		String total="";
		try{
			File file  = new File("/Users/zijian/ZijianJava/CommonWordsData/likeit.txt");
			BufferedReader reader = null;
			reader = new BufferedReader(new FileReader(file));
			String line="";
			while((line = reader.readLine())!=null){
				total+=line+" ";
			}
			reader.close();
		}
		catch(Exception e) {e.printStackTrace();}
		WordFrequency tf = new WordFrequency(total);
		tf.Statistiques();	
		/*
		WordFrequency tf1 = new WordFrequency("This is a test. Yes a test of a test. Test.");
		tf1.Statistiques();
		*/	
	}
}
