package tp4;

public class conditionnel4 {

	public static void main(String[] args) {
		//int p1 =2, p2=3,p3=4,p4=-9,p5=10;
		int p1=10,p2=9,p3=-1,p4=4,p5=8;
		int median;
		int maxp1p2p3 = 0;
		if (p1 <= p2) {
			if (p2<=p3) {
				maxp1p2p3 = p3;
				}
			else maxp1p2p3 = p2; 
		}
		else 
			if (p1<p3) {
				maxp1p2p3 = p3;
				}
			else maxp1p2p3 = p1;
		int maxp2p3p4;
		if (p2 <= p3) {
			if (p3<=p4) {
				maxp2p3p4 = p4;
				}
			else maxp2p3p4 = p3; 
		}
		else 
			if (p2<p4) {
				maxp2p3p4 = p4;
				}
			else maxp2p3p4 = p2;
		int maxp3p4p5;
		if (p3 <= p4) {
			if (p4<=p5) {
				maxp3p4p5 = p5;
				}
			else maxp3p4p5 = p4; 
		}
		else 
			if (p3<p5) {
				maxp3p4p5 = p5;
				}
			else maxp3p4p5 = p3;
		if (maxp1p2p3 <= maxp2p3p4) {
			if (maxp2p3p4<=maxp3p4p5) {
				median = maxp1p2p3;
				}
			else 
				if (maxp1p2p3<=maxp3p4p5){
					median = maxp1p2p3;
				}else median =maxp3p4p5;
		}
		else 
			if (maxp2p3p4 <maxp3p4p5) {
			     median = maxp2p3p4;
			}else median = maxp3p4p5;
		System.out.println(median);
	
	
	
	
	
	
	
	
	}
}
