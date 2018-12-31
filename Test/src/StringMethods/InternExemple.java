package StringMethods;
//The java string intern() method returns the interned string. 
//It returns the canonical representation of string.
//It can be used to return string from memory, if it is created by new keyword. 
//It creates exact copy of heap string object in string constant pool.
public class InternExemple {

	public static void main(String[] args) {
		String s1 = "WANG Zijian";
		String s2 = s1.intern();//returns String from pool.
		String s3 = new String("WANG Zijian");
		String s4 = s3.intern();
		System.out.println(s1==s2);//True
		System.out.println(s1==s3);//False
		System.out.println(s1==s4);//True
        System.out.println(s2==s3);//False
        System.out.println(s2==s4);//True
        System.out.println(s3==s4);//False
        int i=s1.indexOf(" ");
        String empty=s1.substring(i,i+1);
        System.out.println(empty.isEmpty());//False " "!=""
	}

}
