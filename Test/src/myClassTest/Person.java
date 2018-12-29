package myClassTest;

public class Person {
     private int idnumero;
     private String name;
     private String sex;
     private int age;
     
     public Person() {
    	 super();
    	 System.out.println("super(): ");
     }
     
     public Person(int id, String n, String s, int a) {
    	 idnumero=id;
    	 name=n;
    	 sex=s;
    	 age=a;
     }
     
     public void display() {
    	 System.out.println("Sex: " + sex + " Nom: " + name + " age: " + age + " ID: "+idnumero);
     }
     
     public static void main(String[] arg) {
    	 Person p = new Person();
    	 System.out.println(p);
    	 p.display();
    	 Person p0 = new Person(17005160,"WANG Zijian","Monsieur",24);
    	 p0.display();
    	 
     }
}
