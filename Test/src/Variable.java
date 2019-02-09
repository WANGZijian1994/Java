public class Variable {
	
	static char a = 'A';
	static char b = 'B';
	static char c = 'C';
	static char d = 'D';

	public static void main(String[] args) {
		test();
		System.out.println("a = "+a +" b = "+b+" c = "+c+" d = "+d);
		//a = 'D'
		//b = 'C'
		//c = 'C'
		//d = 'D'

	}
	
	public static void test() {
	    char temp = 0;
	    a=temp;
	    temp=d;
	    a=d;

	    b=temp;
	    temp=c;
	    b=c;
	}

}