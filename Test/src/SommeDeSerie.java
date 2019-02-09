public class SommeDeSerie {
//2/1+3/2+5/3+8/5+13/8+21/13= Febonnachi
	public static void main(String[] args) {
		int x=1,y=2,z=0;
		double k = 3.5;
		for(int i =1;i<=5;i++) {
			int n = 1;
			z =x+y;
			x=y;
			y=z;
			k+=n+x/z;
			System.out.println("x = "+x+" y = "+y+" z = "+z);
			
		}
        System.out.println(k);
	}

}
