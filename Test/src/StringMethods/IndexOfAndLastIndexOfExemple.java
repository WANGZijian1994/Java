package StringMethods;
//The java string indexOf() method returns index of given character value or substring. 
//If it is not found, it returns -1. The index counter starts from zero.
public class IndexOfAndLastIndexOfExemple {
//int indexOf(int ch)                           -->   returns index position for the given char value
//int indexOf(int ch, int fromIndex)            -->   returns index position for the given char value and from index
//int indexOf(String substring)                 -->   returns index position for the given substring
//int indexOf(String substring, int fromIndex)  -->   returns index position for the given substring and from index 
	public static void main(String[] args) {
		String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ ABCDEFGH";
		int index1=s1.indexOf("CD");
		System.out.println(index1);//2 s1.charAt(i)='C'
		index1=s1.indexOf('C');
		System.out.println(index1);//2
        int index2 = s1.indexOf('A',25);
        System.out.println(index2);//27
        int index3 = s1.lastIndexOf('A');//
        System.out.println(index3);//27
        int index4 = s1.lastIndexOf('F',28);//
        System.out.println(index4);//
	}

}
