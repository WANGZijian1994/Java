package Boucle;

public class Exercice1 {

	public static void main(String[] args) {
		int incrementer = 0;
		for(int i = 101;i<=200;i++) {
			int counter = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {counter++;}
				else {}
			}
			if(counter==2) {
				System.out.println(i);
				incrementer++;
			}else {}
		}
		System.out.println(incrementer);
		
	}

}
