package StringMethods;

public class ConcatExemple {

	public static void main(String[] args) {
		String s1="java string";
		s1.concat("is immutable.");
		System.out.println(s1);//s1ÊÇimmutableµÄ
		s1=s1.concat("is immutable.");
		System.out.println(s1);
		String str1 = "Hello";  
        String str2 = "Javatpoint";  
        String str3 = "Reader";  
        // Concatenating one string   
        String str4 = str1.concat(str2);        
        System.out.println(str4);  
        // Concatenating multiple strings  
        String str5 = str1.concat(str2).concat(str3);  
        System.out.println(str5); 
        String str6 = str1.concat(" ").concat(str2).concat(" ").concat(str3);
        System.out.println(str6);
        //Hello Javatpoint Reader
        String str7 = str1.concat("!!!");
        System.out.println(str7);
        //Hello!!!
        String str8 = str1.concat("@").concat(str2);
        System.out.println(str8);
        //Hello@Javatpoint

	}

}
