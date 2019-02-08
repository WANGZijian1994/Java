import java.io.*;

public class Bases {
	public static void main(String[] args) {
		char ch=' ';
		System.out.print("Saisissez un caract¨¨re: ");
		try {
			ch = (char)System.in.read();
		}
		catch (IOException e) {}
		System.out.println(ch);
		System.out.println("La valeur du caract¨¨re en ASCII est de:"+(int)ch);
 
		//Types de valeurs:
		byte b = 127;
		int a =126;
		short s = 12;
		long l = 123456788l;
		float f = 7.3f;
		double d = 0.2;
		char c = 'C';
		boolean flag = true;
		String str = "Bonjour le monde.";
		String str1 = new String("Hello World");
		System.out.println("a+b = "+ a+b);//126127 
		System.out.println("a+b = "+ (a+b));//253
		System.out.println("c + d = "+ c+d);//C0.2
		System.out.println("c + d = "+ (c+d));//ASCII C = 67 d=0.2-->c+d=67.2
		System.out.println("d+f="+d+f);//0.27.3f
		System.out.println("d+f="+(d+f));//7.5000001907348635
		System.out.println(l);//123456788

		
	}
	
}
