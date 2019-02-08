import java.util.ArrayList;
import java.util.List;
public class Exercice4 {

	public static void main(String[] args) {
		List l=new ArrayList<>();
		int i = 90;
		int f = i;
		for(int k = 1;k<=f;k++) {
			if(f%k==0){
			int counter=0;
			for(int j = 1;j<=k;j++) {
				if(k%j==0) {counter++;}
			}
			if(counter==2) {
				l.add(k);
				f=f/k;
				while(f%k==0) {l.add(k);f=f/k;}
				}
			}
		}
		System.out.println(l);

	}

}
