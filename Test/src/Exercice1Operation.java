
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
		test(i);//1 ������test(i)��������ʱ�� i = 0��Ϊʵ�ʲ�����ֵ0������test��������ʽ����i��test�����е�i ����ʽ��������ʽ����ֵ�ĸı䲻��Ӱ��ʵ�ʲ���������test�����е�i��ֵ��1������main������i��ֵ��ȻΪ0
		i = ++i;
		System.out.println("----" + i);//
		i = i++;
		System.out.println("****" + i);//
		

	}

}
