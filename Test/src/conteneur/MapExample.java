package conteneur;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	//Object map.put(key,value)
	
	//Object map.get(key)
	
	//int map.size()
	
	//Object map.remove(key)
	
	//boolean map.containsKey(key)

	//Set map.KeySet()
	public String dictionnary(String mot) {
		Map<String,String> vocabulaire = new HashMap<String,String>();
		vocabulaire.put("dog","chien");
		vocabulaire.put("bitter","âpre");
		vocabulaire.put("cat","chat");
		vocabulaire.put("fuck", "merde");
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
