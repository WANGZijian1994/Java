package ListMethods;

import java.util.*;
import java.util.regex.Pattern;
import java.io.*;

public class CharactersInPlay{

	public static void main(String[] args) {
		List<String>Characters = new ArrayList<String>();
		try {
			File file = new File("/Users/zijian/ZijianJava/CommonWordsData/likeit.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String info = "";
			while((info=reader.readLine())!=null){
				String person="";
				for(int i = 2;i < info.length();++i){
					char ch = info.charAt(i);
					char ch1 = info.charAt(i-1);
					char ch2 = info.charAt(i-2);
					if((ch=='.')){
						if((Character.isUpperCase(ch1))&&(Character.isUpperCase(ch2))){
							person = info.substring(0,i);
							person = person.replace(" ", "");
							Characters.add(person);
						}
					}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		Characters.remove(0);
		
		for(int i = 0;i<Characters.size();++i) {
			String s = Characters.get(i);
			s = s.replaceAll("[a-z]", "");
			Characters.set(i,s);
		}
		System.out.println(Characters);
		System.out.println(Characters.size());
		Map<String,Integer>Stats = new HashMap<String,Integer>();
		for(int i = 0;i<Characters.size();++i) {
			String personnage = Characters.get(i);
			if(!Stats.containsKey(personnage)) {
				Stats.put(personnage, 1);
			}
			else {
				int value = Stats.get(personnage);
				Stats.put(personnage,++value);
			}
		}
		System.out.println(Stats);
	}
}
