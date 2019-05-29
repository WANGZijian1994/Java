package StringMethods;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String s = "This is just a jok";
		StringBuilder sb = new StringBuilder(s);
		sb.append("e.");
		System.out.println(sb.toString());
		int i = sb.indexOf("is j");
		sb.insert(i+2, " never ");
		System.out.println(sb.toString());
		sb.delete(sb.indexOf(" just"), sb.indexOf(" just")+5);
		System.out.println(sb.toString());
	}
}
