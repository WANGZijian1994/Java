package tp4;

public class conditionnel2 {

	public static void main(String[] args) {
		int p1 = 10, p2 =9, p3=-1;
		int Min = 0;
		if (p1 <= p2) {
			if (p2<=p3) {
				Min = p1;
				}
			else 
				if (p1<=p3){
					Min = p1;
				}else Min =p3;
		}
		else 
			if (p2 < p3) {
			     Min = p2;
			}else Min = p3;
		System.out.println(Min);
	}

}
