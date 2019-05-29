package conteneur;

import java.util.*;
import java.io.*;

public class TermFrequencyStats {
	
	public static class ValueComparator implements Comparator<Map.Entry<String,Integer>>
	{
		public int compare(Map.Entry<String,Integer>m1,Map.Entry<String, Integer>m2)
		{
			return m2.getValue()-m1.getValue();
		}
	}

	public static void main(String[] args) {
		Hashtable<String,Integer> TF = new Hashtable();
		String texte = "Il avait été inauguré avec faste, fin août 2018, par l’ancien président maldivien Abdulla Yameen. En quelques mois, le « pont de l’amitié Chine-Maldives » est devenu le symbole des tensions qui s’accroissent entre Pékin et l’archipel de l’océan Indien. Cet édifice de 2,1 kilomètres, reliant la capitale, Malé, à l’île artificielle abritant l’aéroport.";
		texte += ' ';
		texte = texte.toLowerCase();
		texte = texte.replaceAll("\\pP", "");
		texte = texte.replaceAll("\\d", " ");
		List<String>tokens = new ArrayList<>();
		String token = "";
		for(int i=0;i<texte.length();i++){
			char c = texte.charAt(i);
			if(c==' ') {
				tokens.add(token);
				token="";
			}
			else {
				token+=c;
			}
		}
		int counter = 1;
		for(int i = 0;i<tokens.size();++i) {
			String element = tokens.get(i);
			if(!TF.containsKey(element)) {
				TF.put(tokens.get(i), counter);
			}
			else {
				TF.put(tokens.get(i), ++counter);
			}
			counter=1;
		}
		System.out.println(TF);
		List<Map.Entry<String, Integer>>ordre = new ArrayList<>();
		ordre.addAll(TF.entrySet());
		ValueComparator vc = new ValueComparator();
		Collections.sort(ordre,vc);
		for(Iterator<Map.Entry<String, Integer>> it = ordre.iterator();it.hasNext();) {
			System.out.println(it.next());
		}		
	}
}
