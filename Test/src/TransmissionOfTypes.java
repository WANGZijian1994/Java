public class TransmissionOfTypes {

    public int ASCII(char c) {
    	int i = c;
    	return i;
    }
    
    public char PositionASCII(int i) {
    	char c = (char)i;
    	return c;
    }
    
	public static void main(String[] args) {
		int a1 = 3;
		byte a2 = (byte) a1;//8 <-- 32
		short a3 = (short) a1;//16 <-- 32
		System.out.println(a2);
        System.out.println(a3);
        long a4 = a1;//64 <-- 32
        System.out.println(a4);
        double d1 = 0.2d;
        float f1 = 0.6f;
        float f2 = (float)d1;//0.2
        double d2 = f1;//0.6
        System.out.println(f2);
        String s = String.format("%.1f", d2);
        System.out.println(s);
        TransmissionOfTypes t = new TransmissionOfTypes();
        System.out.println(t.ASCII('k'));//107
        System.out.println(t.PositionASCII(97));
        
        
	}

}
