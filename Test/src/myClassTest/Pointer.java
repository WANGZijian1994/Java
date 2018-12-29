package myClassTest;

public class Pointer {

	public static void main(String[] args) {
		Person p1 = new Person(1700,"WANG Zijian","Male",24);
		Person p2 = p1;
		System.out.println(p1==p2);
		Person p3 = new Person(1700,"WANG Zijian","Male",24);
		System.out.println(p1==p3);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}
