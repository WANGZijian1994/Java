
public class FacteurParfait {
	static int q;

	public static void main(String[] args) {
		for(int i=1;i<=10000;i++) {
			q=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					q+=j;
				}
			}
			if(q==i) {System.out.println(i);}
		}

	}

}
