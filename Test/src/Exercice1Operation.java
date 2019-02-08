
public class Exercice1Operation {
	public static void test(int i) {
		i++;
		System.out.println(i);//
		System.out.println(i++);//
		System.out.println(++i);//
		System.out.println(i);//
		System.out.println(++i);//
		System.out.println(i++);//
		System.out.println(i);//
	}

	public static void main(String[] args) {
		int i =0;
		test(i);//1 调用了test(i)方法，此时的 i = 0作为实际参数将值0传给了test方法的形式参数i，test方法中的i 是形式参数，形式参数值的改变不会影响实际参数，所以test方法中的i的值是1，而，main方法中i的值仍然为0
		i = ++i;
		System.out.println("----" + i);//
		i = i++;
		System.out.println("****" + i);//
		

	}

}
