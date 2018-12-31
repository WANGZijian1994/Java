package StringMethods;

public class ContainsExemple {
	String s1 = "Javascript";
	String s2 = "If you can work with Javascript, you could be well-paid.";
	public boolean ifContain(String objet,String target) {
	    boolean flag = target.contains(objet);
	    return flag;
	}

	public static void main(String[] args) {
		String name="what do you know about me";
		System.out.println(name.contains("do you"));
		System.out.println(name.contains("about"));
		System.out.println(name.contains("me"));
		System.out.println(name.contains(" "));
		boolean isContain = name.contains("Know");
		System.out.println(isContain);
		ContainsExemple test = new ContainsExemple();
		System.out.println(test.ifContain(test.s1, test.s2));

	}

}
