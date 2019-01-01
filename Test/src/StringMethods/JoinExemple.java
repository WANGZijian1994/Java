package StringMethods;
//The java string join() method returns a string joined with given delimiter. 
//In string join method, delimiter is copied for each elements.
public class JoinExemple {

	public static void main(String[] args) {
		String s1=String.join("-","Bienvenue","ид","Paris");
		String time=String.join(":", "11","41");
		String date=String.join("-", "2019","01","01");
		System.out.println("time : "+time);
		System.out.println("Date : "+date);
		System.out.println(s1);

	}

}
