package conteneur;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public String dictionnary(String mot) {
		Map<String,String> vocabulaire = new HashMap<String,String>();
		vocabulaire.put("dog","chien");
		vocabulaire.put("bitter","âpre");
		vocabulaire.put("cat","chat");
		vocabulaire.put("fuck", "merde");
		String value = vocabulaire.get(mot);
		return value;
	}

	public static void main(String[] args) {
		MapExample dict = new MapExample();
		String definition = dict.dictionnary("dog");
		System.out.println(definition);

	}

}
