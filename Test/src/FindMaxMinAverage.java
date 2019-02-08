
public class FindMaxMinAverage {
	public int Max(int a,int b,int c) {
		int result1 = a>b?a:b;
		int result2 = b>c?b:c;
		int result = result1>result2?result1:result2;
		return result;
	}
	
	public int Min(int a,int b,int c) {
		int result1 = a<b?a:b;
		int result2 = b<c?b:c;
		int result = result1<result2?result1:result2;
		return result;
	}
	
	public double Average(int a, int b,int c) {
		double average = (a+b+c)/3;
		return average;
	}

	public static void main(String[] args) {
		FindMaxMinAverage r = new FindMaxMinAverage();
		System.out.println(r.Max(13, 14, 23));
		System.out.println(r.Min(13, 14, 23));
		System.out.println(r.Average(13, 14, 23));
		

	}

}
