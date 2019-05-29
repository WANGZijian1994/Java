package StringMethods;

public class StringBufferDemo {

	//StringBuffer类，modifiables
	public static void main(String[] args) {
		String s = new String("This is A String");
		StringBuffer sb = new StringBuffer(s);
		sb.deleteCharAt(s.length()-1);
		System.out.println(sb.toString());
		sb.insert(s.length()-1, "g");
		System.out.println(sb.toString());
		sb.deleteCharAt(8);
		sb.insert(8, "a");
		sb.insert(s.length(), "BufferDemo");
		System.out.println(sb.toString());
		sb.append(".");
		System.out.println(sb.toString());
		sb.append(false);
		System.out.println(sb.toString());
		sb.delete(sb.length()-5, sb.length());
		System.out.println(sb.toString());
	}
}
