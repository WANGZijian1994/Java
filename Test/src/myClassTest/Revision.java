package myClassTest;

public class Revision {

	public static void main(String[] args) {
    String s1="abc";
    String s2="abc";
	System.out.println(s1==s2);//true
    
	System.out.println(5.2 / 2);//2.6
	double l = 5.2%2;//le reste
	System.out.println("5.2%2 = " + l);//1.2
	System.out.println("5%2 = " + (5%2));//1
	int k = (int) l;// transform 
	System.out.println(k);//1
    
	int i = 010;
    System.out.println(i);//8
	System.out.println("++i = "+ ++i);//9
	System.out.println(i);//9
	i=010;
	System.out.println("i++ = "+ i++);//8
	System.out.println(i);//9
	int j=10;
	System.out.println("++j = "+ (++j));//11
	System.out.println(j);//11
	j=10;
	System.out.println("j++ = "+ (j++));//10
	System.out.println(j);//11
    
	char c='a';
    if(c==97){
		System.out.println(c);//a
    }else{
  		System.out.println('C');
    }

	}

}
