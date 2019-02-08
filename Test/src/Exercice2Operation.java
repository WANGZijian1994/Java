
public class Exercice2Operation {

	public static void main(String[] args) {
		int x = 5, y =6,z1,z2,z3;
		z1 = ++x + y++; 
		System.out.println("x = "+x+" y = "+y);//x = 6,y = 7
		System.out.println(z1);//12
		z2 = ++x + x++;
		System.out.println("x = "+x+" y = "+y);//x = 8,y = 7
		System.out.println(z2);//14
		x = ++x + x++;
		System.out.println("x = "+x);//x = 18
		z3 = x > y ? ++x : y++;
		System.out.println(z3);//19

	}
	
}
