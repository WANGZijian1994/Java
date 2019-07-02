package TemplateText;

import java.util.*;
import java.io.*;

public class Gladlib {
	
	private ArrayList<String> adjectiveList = new ArrayList<String>();
	private ArrayList<String> nounList = new ArrayList<String>();
	private ArrayList<String> colorList = new ArrayList<String>();
	private ArrayList<String> countryList = new ArrayList<String>();
	private ArrayList<String> nameList = new ArrayList<String>();
	private ArrayList<String> animalList = new ArrayList<String>();
	private ArrayList<String> timeList = new ArrayList<String>();
	private ArrayList<String> verbList = new ArrayList<String>();
	private ArrayList<String> fruitsList = new ArrayList<String>();
	private ArrayList<String> numberList = new ArrayList<String>();
	private StringBuilder info = new StringBuilder();
	
	public Gladlib(String filename){
		this.adjectiveList=stuffer(adjectiveList,"adjective.txt");
		this.nounList = stuffer(nounList,"noun.txt");
		this.colorList = stuffer(colorList,"color.txt");
		this.countryList = stuffer(countryList,"country.txt");
		this.nameList = stuffer(nameList,"name.txt");
		this.animalList = stuffer(animalList,"animal.txt");
		this.timeList = stuffer(timeList,"timeframe.txt");
		this.verbList = stuffer(verbList,"verb.txt");
		this.fruitsList = stuffer(fruitsList,"fruit.txt");
		this.numberList.add("1");
		this.numberList.add("2");
		try {
			File file = new File("/Users/zijian/ZijianJava/template/data/"+filename);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			while((line=reader.readLine())!=null) {
				info.append(line+" ");
			}
			reader.close();
		}
		catch(Exception e) {e.printStackTrace();}		
	}
	
	private ArrayList<String> getList(String str) {
		if(str=="adjective") {return adjectiveList;}
		else if(str=="noun") {return nounList;}
		else if(str=="color") {return colorList;}
		else if(str=="verb") {return verbList;}
		else if(str=="fruits") {return fruitsList;}
		else if(str=="animal") {return animalList;}
		else if(str=="country") {return countryList;}
		else if(str=="name") {return nameList;}
		else if(str=="timeframe"){return timeList;}
		else if(str=="number") {return numberList;}
		else {return null;} 
	}
	
	private ArrayList<String> stuffer(ArrayList<String>nameOfList,String filename){
		try {
			File file = new File("/Users/zijian/ZijianJava/template/data/"+filename);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			while((line=reader.readLine())!=null) {
				nameOfList.add(line);
			}
			reader.close();
		}
		catch(Exception e) {e.printStackTrace();}
		return nameOfList;
	}
	
	private String getSubstitute(String str){
		String label = "<"+str+">";
		if(info.indexOf(label)==-1) {return label+", there is no such a label to substitute in this text.";} 
		int index = 0;
		ArrayList<String>al = getList(str);
		if(al!=null) {
		while(index!=-1){
			int randomInt = new Random().nextInt(al.size());
			String substitute = al.get(randomInt);
			index = info.indexOf(label,index);
			if(index==-1) {break;}
			info = info.replace(index, index+label.length(), substitute);
			index++;
		}
		String result = info.toString();
		return result;}
		else {return "Enter : adjective,noun,color,country,verb,timeframe,name,fruits";}
	}
	
	public void Afficher() {
		getSubstitute("adjective");
		getSubstitute("color");
	    getSubstitute("animal");
		getSubstitute("timeframe");
		getSubstitute("name");
		getSubstitute("country");
		getSubstitute("number");
		getSubstitute("noun");
		getSubstitute("verb");
		getSubstitute("fruits");
		System.out.println(info.toString());
	}
	

	public static void main(String[] args) {
		Gladlib g1 = new Gladlib("madtemplate.txt");
		System.out.println(g1.info);
		g1.Afficher();
		Gladlib g2 = new Gladlib("madtemplate3.txt");
		System.out.println(g2.info);
		g2.Afficher();
	}
}
