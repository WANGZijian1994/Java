package StringMethods;
//The java string getChars() method copies the content of this string into specified char array.
public class GetCharExemple {

	public static void main(String[] args) {
        String str = new String("hello javatpoint how r u");
        char ch[] = new char[12];// ����һ������Ϊ12��һάchar���顣
        try {
        	str.getChars(6,18,ch,0);
        	System.out.println(ch);
        }catch(Exception e) {System.out.println(e);}
        

	}

}
