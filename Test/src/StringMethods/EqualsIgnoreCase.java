package StringMethods;
import java.util.ArrayList;
public class EqualsIgnoreCase {

	public static void main(String[] args) {
		String s1 = "WANG Zijian";
		ArrayList<String>names=new ArrayList();
		names.add("WANGZIJIAN");
		names.add("WANG ZIJIAN");
		names.add(1, "wang zijian");
		names.add("WANG Zijian");
		System.out.println(names);
		for(String str:names) {
			if(str.equals(s1)) {
				System.out.println("Recognized");
			}
			else {
				if(str.equalsIgnoreCase(s1)) {System.out.println("Recognized");}
				else System.out.println("Not Recognized");
			}
		}

	}

}
