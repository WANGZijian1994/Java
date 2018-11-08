package tp4;

public class Exercice2dowhile {

	public static void main(String[] args) {
		String s1 ="azerty",s2="ytreza";
		int i1 = 0, i2 =s2.length()-1;
		char c1,c2;
		boolean flag=true;
        do{
        	c1=s1.charAt(i1);
     		c2=s2.charAt(i2);
			if (c1==c2)
			{
				i1+=1;
				i2-=1;
			}else {flag=false;break;}}
		while (i1<=s1.length()-1);
        System.out.println(flag);
		System.out.println("s1 et s2 sont des mots miroirs-----"+ flag);
		}

	}


