
public class MultiplicationEtSomme {

	public static void main(String[] args) {
		int q =0;
		for(int i=1;i<=5;i++) {
			int p=1;
			for(int j=1;j<=i;j++) {
				p *= j;
			}
			System.out.println(p);
			q+=p;
		}
		System.out.println("1+2!+3!+4!+5! = "+q);

	}

}
