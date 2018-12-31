package StringMethods;

public class StartsWithAndEndsWithExemple {

	public static void main(String[] args) {
		String name="what do you know about me";
		boolean flag1=name.endsWith("e");
		boolean flag2=name.endsWith("t me");
		boolean flag3=name.startsWith("w");
		boolean flag4=name.startsWith("what do");
		System.out.println(flag1);//true
		System.out.println(flag2);//true
		System.out.println(flag3);//true
		System.out.println(flag4);//true
		

	}

}
