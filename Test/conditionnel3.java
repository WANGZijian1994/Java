package tp4;

public class conditionnel3 {

	public static void main(String[] args) {
		int p1 = 20, p2 =16, p3=14;
		//int p1 = 6, p2 =5, p3=4;
		//int p1 = 10, p2 =9, p3=-1;
		int Median = 0;
		if (p1 <= p2) {
			if (p2<=p3) {
				Median = p2;
				}
			else 
				if (p1<=p3){
					Median = p3;
				}else Median =p1;
		}
		else 
			if (p2 >= p3) {
			     Median = p2;
			}else 
				if (p1>=p3) {
					Median = p3;
				}else Median = p1;
		System.out.println(Median);

	}

}
