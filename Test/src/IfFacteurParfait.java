public class IfFacteurParfait {
	static int q;
	public boolean Parfait(int i) {
		boolean flag=false;
		q=0;
		for(int j=1;j<i;j++) {
			if(i%j==0) {q+=j;}
		}
		if(q==i) {flag=true;}
		return flag;
	}

	public static void main(String[] args) {
		IfFacteurParfait f = new IfFacteurParfait();
		System.out.println(f.Parfait(6));
		System.out.println(f.Parfait(28));
	

	}

}
