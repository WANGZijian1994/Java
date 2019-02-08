public class Exercice2 {

	public static void main(String[] args) {
		int counter = 0;
		for(int i = 100;i<1000;i++) {
			int a=0,b=0,c=0;
			c = i%10;
			b = i/10/10;
			a = i/10%10;
			if(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)==i)
			{counter++;System.out.println(i);}		
			}
		System.out.println(counter);

	}

}
