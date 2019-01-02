package heritage;

public class ClassTest {

	public static void main(String[] args) {
		Director WANG = new Director("WANG Zijian",'M',24,50000,"Information Tech",100);
		System.out.println(WANG.getDetails());
		System.out.println(WANG.getSalary());
	}

}
