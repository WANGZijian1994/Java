package ShallowCopy_DeepCopy;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CollectionCloneTest{
	//private static final Logger logger = LoggerFactory.getLogger(CollectionCloningclass);
	
	public static void main(String[] args) {
		Collection org = new HashSet<Employee>();
		Employee e1 = new Employee("Joe","Manager");
		Employee e2 = new Employee("Tim","Developper");
		Employee e3 = new Employee("Frank","Developper");
		org.add(e1);org.add(e2);org.add(e3);
		
		//Shallow Copy
		Collection copy = new HashSet(org);
		
		//imprimer les deux conteneurs.
		System.out.println("Original Collection : ");
		System.out.println(org);
		System.out.println("Copy of Collection :  ");
		System.out.println(copy);
		System.out.println("-----------------");
	
		//Modifier l'original
		Iterator itr = org.iterator();
		while(itr.hasNext()){
			Employee e = (Employee)itr.next();
			e.setDestination("staff");
		}
		
		//Après la modification:
		System.out.println("Original Collection after modification : " + "\n"+org);
		System.out.println("Copy of Collection without modification : "+"\n"+copy);
		System.out.println("\n");
		
		//So the copy has also been changed by that modification of the original one.
		//How to make a deep copy Java??? protected Employee clone()
		
		Collection org1 = new HashSet<Employee>();
		Employee e4 = new Employee("Pierre","Porfesseur");
		Employee e5 = new Employee("Vincent","Pythonniste");
		Employee e6 = new Employee("K","Java développeur");
		org1.add(e4);org1.add(e5);org1.add(e6);
		
		HashSet<Employee> deepCopy = new HashSet<Employee>(org1.size());
		Iterator<Employee> itr1 = org1.iterator();
		while(itr1.hasNext()) {
			Employee e = (Employee)itr1.next().clone();
			deepCopy.add(e);
		}
		
		//imprimer les deux conteneurs.
		System.out.println("Original Collection : ");
		System.out.println(org1);
		System.out.println("Deep Copy of Collection :  ");
		System.out.println(deepCopy);
		System.out.println("-----------------");
		
		//Modifier
		Iterator<Employee>itr2 = org1.iterator();
		while(itr2.hasNext()) {
			Employee e = (Employee)itr2.next();
			e.setDestination("C++ Linux Développeur");
		}
		
		//Après la modification:
		System.out.println("Original Collection after modification : " + "\n"+org1);
		System.out.println("Copy of Collection without modification : "+"\n"+deepCopy);
	}

}
