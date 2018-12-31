package StringMethods;

public class FormatExemple {

	public static void main(String[] args) {
		String s1 = String.format("%s", "WANG Zijian");//string
		String s2 = String.format("%c", 'M');//char
		String s3 = String.format("%d", 24);//int
		String s4=String.format("%f",14.75f);//float
		System.out.println(s1.concat(" ").concat(" ").concat(s2).concat(" ").concat(s3).concat(" ").concat(s4));
	}

}
