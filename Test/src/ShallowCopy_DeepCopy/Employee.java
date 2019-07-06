package ShallowCopy_DeepCopy;

public class Employee implements Cloneable{
	private String name;
	private String destination;
	
	public Employee(String name,String destination) {
		this.name = name;
		this.destination = destination;
	}
	
	public String getDestination() {return this.destination;}
	
	public String getName() {return this.name;}
	
	public String setDestination(String destination) {
		this.destination = destination;
		return destination;
	}
	
	public String setName(String name) {
		this.name = name;
		return name;
	}
	
	@Override
	public String toString() {
		return String.format("%s:%s",this.name,this.destination);
	}
	
	@Override
	protected Employee clone() {
		Employee clone = null;
		try {
			clone = (Employee)super.clone();
		}
		catch(CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
		return clone;
	}
}
