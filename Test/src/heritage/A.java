package heritage;

public abstract class A {
	char d[];
	static int n;
	
	A(char b, char c,int m){
	    n = m;
		d=new char[n];
		for(int i=0;i<n;i++) {
			if(i % 3==0) {
				d[i]=b;
			}
			else {d[i]=c;}
		}
	}
	
	abstract public int m1(int m);
	
	public int m2(int m) {
		int incrementer = 0;
		for(int i=0;i<n;i+=m) {
			//System.out.println(d[m]);
			incrementer+=1;
		}
		return incrementer;
	}

}
