
public class Circle {
	final static double PI = 3.1415926;
    
	public static double area(double r) {
		double area = PI*Math.pow(r, 2);
		return area;
	}
	
	public static double perimeter(double r) {
		double perimeter = 2*PI*r;
		return perimeter;
	}
	public static void main(String[] args) {
		System.out.println(area(25.2));
		System.out.println(perimeter(25.2));
		

	}

}
