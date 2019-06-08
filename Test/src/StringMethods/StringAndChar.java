package StringMethods;

public class StringAndChar {

	public static void main(String[] args) {
		String str = "abc";
		char data[] = {'a','b','c'};
		String str1 = new String(data);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.charAt(0));
		String s = "dukeprogrammingpro";
		System.out.println(s.substring(4, 7));//pro
		System.out.println(s.length());
		System.out.println(s.indexOf("g", 8));
		int beg = s.indexOf("pro",4);
		int end = s.lastIndexOf("pro",16);
		System.out.println(beg);
		System.out.println(end);
	}
}
