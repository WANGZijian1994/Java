package heritage;

public class Person {
    protected String name;

	protected char sex;
    
    protected int age;
    
    public Person() {
    	super();
    }
    
    public Person(String name, char sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
    
	public String toString() {
		return "������" + name + "�Ա�" + sex + "���䣺" + age;
	}
	
	public String getDetails() {
		return "������ǣ�"+name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
    
    
}
