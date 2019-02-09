
public class FibonacciSerie {
//1,2,3,5,8,13,21...
	public static void main(String[] args) {
		int x = 1,y = 2,z = 0;
		for(int m = 1;m<=6;m++) {
			z = x+y;
			System.out.println(z);
			x = y;
			y = z;
		}

	}

}
