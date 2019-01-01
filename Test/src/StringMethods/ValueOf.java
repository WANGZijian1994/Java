package StringMethods;

public class ValueOf {

	public static void main(String[] args) {
		int value=30;
		String s1 = String.valueOf(value);
		long l = value;
		short s = (short)value;
		boolean flag=1>0;
		String s2 =String.valueOf(flag);
		String s3 = String.valueOf(l);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
