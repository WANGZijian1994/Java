package StringMethods;

public class GetBytesExemple {

	public static void main(String[] args) {
		String s1 = "ABCDEFG";
		byte[] barr=s1.getBytes();
		System.out.println(barr);
		for(int i=0;i<barr.length;i++) {
			System.out.println(barr[i]);
		}
		String s2 =new String(barr);
		System.out.println(s1.equals(s2));

	}

}
