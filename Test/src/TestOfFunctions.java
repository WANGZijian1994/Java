public class TestOfFunctions {
// Return usage
	public int g (int a) {
		  if (a < 9) {
		    return 9;
		  }
		  
		  if (a < 7) {
		    return 7;
		  }
		  
		  if (a < 4) {
		    return 4;
		  }
		  
		  return 0;
		}
	
	public static void main(String[] args) {
		TestOfFunctions t1 = new TestOfFunctions();
		System.out.println(t1.g(5));//9
		System.out.println(t1.g(11));//9 0
	}

}
