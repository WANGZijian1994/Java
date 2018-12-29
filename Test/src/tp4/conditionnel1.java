package tp4;

public class conditionnel1 {

	public static void main(String[] args) {
		int p1 = 10, p2 =9, p3=-1;
		int Max = 0;
		if (p1 <= p2) {
			if (p2<=p3) {
				Max = p3;
				}
			else Max = p2; 
		}
		else 
			if (p1<p3) {
				Max = p3;
				}
			else Max = p1;
		System.out.println(Max);

	}

}
