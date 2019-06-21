package Caesar_Cipher;

public class Palindrome {

	public static String Reverse(String s) {
		String s1 = new String();
		for(int i=s.length()-1;i>=0;--i){
			s1+=s.charAt(i);
		}
		return s1;
	}
	
	public static void main(String[] args) {
		System.out.println(Reverse("CBA"));
	}
}
