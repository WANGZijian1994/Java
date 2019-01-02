package heritage;

public class Student extends Person{
    protected int chinese,math;
    
    public Student() {
    	super();
    }
    
    public Student(String name, char sex, int age, int chinese, int math) {
    	super.name=name;
    	super.age=age;
    	super.sex=sex;
    	
    	this.chinese=chinese;
    	this.math=math;
    }
    
    public int average() {
    	int average = (chinese+math)/2;
    	return average;
    }
    
	public String getDetails() {  //��������
		return "������ǣ�"+name+"��ƽ������"+average();
	}
}
