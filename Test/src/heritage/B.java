package heritage;

public class B extends A{
	static String a_initialiser = "wang";
	
	B(char b, char c,int m){
		super(b,c,m);
		for(int i=0;i<n;i++) {
			a_initialiser+=d[i];
		}
	}
	
	public int m1(int m) {
		int incrementer=0;
		for(int i=0;i<n;i++) {
			//System.out.println(d[i]);
			incrementer+=1;
		}
		return incrementer;
	}

	public static void main(String[] args) {
		B b=new B('h',a_initialiser.charAt(2),6);
		System.out.println(b.m1(2));//6
		System.out.println(b.m2(5));//2
		System.out.println(b.d);//hnnhnn
		System.out.println(a_initialiser);
	}

}
//B('h','n',6)
//d=['h','n','n','h','n','n']
//a_initialiser="wanghnnhnn"
//hnnhnn
//hn
