package StringMethods;
//Ecrire la methode permettant de verifier si une chaine de caracteres commence et se termine par une chaine de caractere donnee
//Ecrire la methode permettant de verifier si une chaine de caracteres est un mot miroir
//Ecrire la methode permettant de verifier si deux chaines de caracteres sont des anagrammes
public class ExamenJava20182019 {
	public boolean StartEnd (String target,String str) {
		boolean flag=false;
		boolean flag1=str.startsWith(target);
		boolean flag2=str.endsWith(target);
		if(flag1==true && flag2==true) {
			flag=true;
		}
		return flag;}
	public boolean Miroir(String str) {
		boolean flag=false;
		int cpt=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(str.length()-1-i)) {
				cpt++;
			}
		}
		if(cpt==str.length()) {
			flag=true;
		}
		System.out.println(cpt);
		return flag;
	}
	public boolean Anagramme(String str1,String str2) {
		boolean flag=false;
		int cpt=0;
		if(str1.length()==str2.length()) {
		for(int i=0;i<str1.length();i++) {
			String s = String.valueOf(str1.charAt(i));
			if(str2.contains(s)){
				cpt++;
			}
		}
		if(cpt==str1.length()) {
			flag=true;
		}
		
		}
		return flag;
	}
	public static void main(String[] args) {
		ExamenJava20182019 e = new ExamenJava20182019();
		System.out.println(e.StartEnd("e","echange"));
		System.out.println(e.StartEnd("f", "esprit"));
        System.out.println(e.Miroir("ABBA"));
        System.out.println(e.Miroir("azeyeb"));
        System.out.println(e.Anagramme("parisien", "aspirine"));
        
	}

}
