package heritage;

public class Director extends Manager {
	private int allocation;
	
	public Director(String name, char sex, int age) {
		super(name,sex,age);
	}
	
	public Director(String name,char sex,int age,double salary) {
		super(name,sex,age,salary);
	}
	
	public Director(String name, char sex, int age, double salary,String department) {
		super(name,sex,age,salary,department);
	}
	
	public Director(String name,char sex,int age,double salary,String department,int allocation) {
		super(name,sex,age,salary,department);
		this.allocation=allocation;
	}
	
	public int setAllocation(int allocation) {
		this.allocation=allocation;
		return allocation;
	}
	
	public int getAllocation() {
		return allocation;
	}
	
	public String getDetails() {
		return super.getDetails()+String.valueOf(getAllocation());	
		}

}
