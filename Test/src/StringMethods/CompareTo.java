package StringMethods;

public class CompareTo {
	String str1="abcdef";
	String str2="ABCDEF";
	
	public int compare(String s1,String s2) {
		int compare=s1.compareTo(s2);
		return compare;
	}

	public static void main(String[] args) {
		String s1="hello";
		String s2="Hello";
		String s3="hello";
		String s4="meklo";
		String s5="hemlo";
		String s6="flag";
		System.out.println(s1.compareTo(s2));//32     ASCII 'h'(s1)-'H'(s2)=32
		System.out.println(s2.compareTo(s3));//-32    ASCII 'H'(s2)-'h'(s3)=-32
		System.out.println(s1.compareTo(s3));//0      ASCII 'h'='h'
		System.out.println(s1.compareTo(s4));//-5     ASCII 'h'-'m'=-5
		System.out.println(s1.compareTo(s5));//-1     ASCII 'h'='h' 'e'='e' 'l'-'m'=-1
		System.out.println(s1.compareTo(s6));//2      ASCII 'h'-'f'=2
		CompareTo exemple = new CompareTo();
		System.out.println(exemple.compare(exemple.str1,exemple.str2));//32 ASCII 'a'-'A'=32
	
}

}
