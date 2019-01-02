package heritage;

public class Employee extends Person{
     private double salary;
     
     public Employee(double salary) {
		super();
		this.salary = salary;
	}
     
     public Employee(String name,char sex,int age) {
    	 super(name,sex,age);
     }
     
     public Employee(String name, char sex,int age,double salary) {
    	 super(name,sex,age);
    	 this.salary=salary;
     }
     
     public double setSalary(double s){
    	 salary=s;
    	 return salary;
     }
     
     public double getSalary() {
    	 return salary;
     }
     
     public String getDetails() {
    	 String salary = String.valueOf(getSalary());
    	 String details = super.toString()+salary;
    	 return details;
     }
     
     
     
}
