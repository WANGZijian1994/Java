package FindDna;

import java.util.*;


public class StorageResource {
	
	public List<String>donnee;
	
	public StorageResource() {
		donnee = new ArrayList<String>();
	}
	
	public StorageResource(StorageResource other) {
		donnee = new ArrayList<String>();
		donnee = other.donnee;
	}
	
	public void add(String s) {
		donnee.add(s);
	}
	
	public void clear() {
		donnee = new ArrayList<String>();
	}
	
	public boolean contains(String s) {
		int counter = 0;
		for(int i = 0;i<donnee.size();i++) {
			if(s==donnee.get(i)) {
				counter++;
			}
		}
		return counter==0;
	}
	
	public int size() {
		return donnee.size();
	}

	public static void main(String[] args) {
		

	}

}
