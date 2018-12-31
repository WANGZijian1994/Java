package StringMethods;

public class ToCharArray {

	public static void main(String[] args) {
		String s1="hello";
		char[] ch=s1.toCharArray();
		System.out.println(ch);
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}

	}

}
