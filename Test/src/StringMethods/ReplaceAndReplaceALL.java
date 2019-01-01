package StringMethods;
//The java string replace() method returns a string replacing 
//all the old char or CharSequence to new char or CharSequence.
//ReplaceAll ne peut utiliser que sur le String, pas le char.
public class ReplaceAndReplaceALL {

	public static void main(String[] args) {
		String s1="Ce n'est pas bien d'ex¨¦cuter cette loi maintenant.";
		String s2 = s1.replace('a', 'A');
		System.out.println(s2);//Ce n'est pAs bien d'ex¨¦cuter cette loi mAintenAnt.
		String s3 = s1.replace("ex¨¦cuter", "appliquer");
		System.out.println(s3);//Ce n'est pas bien d'appliquer cette loi maintenant.
		String s4 = s1.replace(" ","|");
		System.out.println(s4);//Ce|n'est|pas|bien|d'ex¨¦cuter|cette|loi|maintenant.
		String s5 =s2.replaceAll("A", "a");
		System.out.println(s5);
		

	}

}
