package StringMethods;
//We pass begin index and end index number position in the java substring method where start index is inclusive and end index is exclusive. 
//In other words, start index starts from 0 whereas end index starts from 1.
public class SubStringExemple {

	public static void main(String[] args) {
		String s1="Javascript";
		String substr1=s1.substring(0);//Start with J(0) and end until fin
		System.out.println(substr1);
		String substr2=s1.substring(0, 2);//Start with J(0) and end with a(1)
		System.out.println(substr2);//Ja
		String substr3=s1.substring(3,7);//[3,7[,
		System.out.println(substr3);

	}

}
