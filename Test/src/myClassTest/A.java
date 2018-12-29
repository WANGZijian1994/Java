package myClassTest;

interface People {//接口People
	void peopleList();
}

class Student implements People{//执行People接口的Student类
	public void peopleList() {
		System.out.println("I'm a student.");
	}
}

class Teacher implements People{
	public void peopleList() {
		System.out.println("I'm a teacher.");
	}
}

public class A {

	public static void main(String[] args) {
		People a;//给接口People定义一个对象a
		a=new Student();//对象a赋予Student类对象的特征
		a.peopleList();//调用Student类中的peopleList中的方法。
		System.out.println(a);
		People b;
		b=new Teacher();//接口必须对象化后才能被使用。
		b.peopleList();
		System.out.println(b);
		
		

	}

}
