package tp4;

public class Exercice2 {

	public static void main(String[] args) {
		String s1 = "azerty", s2 = "ytreza";
		//String s1 = "abcdefg",s2 = "gfkdcbb";
		int i1 = 0, i2 =s2.length()-1;
		char c1,c2;boolean flag1;
		flag1=true;
		while (i1<=5)
		{
			c1=s1.charAt(i1);
			c2=s2.charAt(i2);
			if (c1!=c2){
				flag1=false;
				break;}
			else i1+=1;i2-=1;
		}
		System.out.println(flag1);
		System.out.println("s1 et s2 sont des mots miroirs-----"+ flag1);
        
        }
	}


