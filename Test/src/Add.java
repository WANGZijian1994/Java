
public class Add {

	public static void main(String[] args) {
		int p = 2;
		int q = 0,k=0;
		for (int i =0;i<5;i++) {
			q+=p*Math.pow(10, i);
			System.out.println(q);
			k+=q;
		}
        System.out.println(k);
	}

}
