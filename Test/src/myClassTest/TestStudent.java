package myClassTest;
public class TestStudent {

	public static void main(String[] args) {
		InformationOfStudent s1=new InformationOfStudent("WANG Zijian",'M',"1994-04-18");
		System.out.println(s1.StudentInfo());
		System.out.println(s1.getName());
		System.out.println(s1.getSex());
		System.out.println(s1.getBirthday());
		s1.setEngScore(86);
		s1.setCompScore(90);
		//s1.sex = 'M';private
		System.out.println(s1.getAverage());
		System.out.println(s1.getMax());
	}

}
