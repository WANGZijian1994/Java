package StringMethods;
//The java string split() method splits this string against given regular expression and returns an array.
public class SplitExemple {
	static String s1 = "The rain in Spain falls mainly in the plain.";
	static String[] ss = s1.split(" ");
	static String[] ss1=s1.split(" ",1);
	static String[] ss2=s1.split(" ",9);
	
	public static void main(String[] args){
	
	for(int i=0;i<ss.length;i++) {
		System.out.println(ss[i]);
	}
	for(String str : ss1) {
		System.out.println(str);
	}
	for(String str : ss2) {
		System.out.println(str);
	}
}}
