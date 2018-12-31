package StringMethods;
import java.util.ArrayList;
public class EqualsExemple {

	public static void main(String[] args) {
		String s1="WANG Zijian";
		ArrayList<String>names=new ArrayList<>();
		names.add("Tom");
		names.add("Kevine");
		names.add(s1);
		names.add("Cky");
		System.out.println(names);
		for(String s:names) {
			if(s.equals(s1)) {System.out.println("Recognized");}
			else{System.out.println("Not Recognized");}}

	}

}
