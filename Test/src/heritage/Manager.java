package heritage;

public class Manager extends Employee{	
	private String department;
    
	public Manager(String name,char sex,int age,double salary,String department) {
		super(name,sex,age,salary);
		this.department = department;
	}
	
	public Manager(String name, char sex, int age, double salary) {
		super(name, sex, age, salary);
	}

	public Manager(String name, char sex, int age) {
		super(name, sex, age);
	}
	
	public String setDepartment(String department) {
		this.department=department;
		return department;
	}
	
	public String getDepartment() {
		return department;
	}
     
	public String getDetails() {
		return super.getDetails()+getDepartment();
	}

}
