package StringMethods;
//The java string trim() method eliminates leading and trailing spaces. 
//The unicode value of space character is '\u0020'. 
//The trim() method in java string checks this unicode value before and after the string, 
//if it exists then removes the spaces and returns the omitted string.
//The string trim() method doesn't omits middle spaces.
public class TrimExemple {

	public static void main(String[] args) {
		String s1 ="  hello java string   ";
		System.out.println(s1.length());
		String s2 = s1.trim();
		System.out.println(s2.length());
		System.out.println(s2);
		

	}

}
