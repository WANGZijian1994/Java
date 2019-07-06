package Caesar_Cipher;

public class Palindrome {

	public static String Reverse(String s) {
		String s1 = new String();
		for(int i=s.length()-1;i>=0;--i){
			s1+=s.charAt(i);
		}
		return s1;
	}
	
	public static String Reverse2(String s) {
		String s1 = new String();
		for(int i = 0;i<s.length();i++){
			s1 = s.charAt(i)+s1;
		}
		return s1;
	}
	
	public static boolean isPalinDrome(String s) {
		String reverse = new String();
		String original = s.toLowerCase();
		original = original.replaceAll("[^A-Za-z]", "");
		for(int i = original.length()-1;i>=0;i--) {
			char ch = original.charAt(i);
			reverse+=ch;
		}
		System.out.println(reverse + ":"+original);
		return reverse.equals(original);
	}
	
	public static void main(String[] args) {
		System.out.println(Reverse("CBA"));
		System.out.println(Reverse2("CBA"));
		System.out.print(isPalinDrome("Etto Otte"));
	}
}
