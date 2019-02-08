import java.text.DecimalFormat;

public class TwoDigitsAfterThePoint {//2ÖÖ·½·¨

	public static void main(String[] args) {
		//1.
		DecimalFormat d = new DecimalFormat("0.00");
		double d1 = 0.23456;
		System.out.println(d.format(d1));
		
		double d2 = 0.23412345678;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(d2));
		
		//2.
		String s = String.format("%.2f", d1);
		System.out.println(s);
		String s1 = String.format("%.3f", d2);
		System.out.println(s1);
		

	}

}
