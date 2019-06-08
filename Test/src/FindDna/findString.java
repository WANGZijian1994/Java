package FindDna;

public class findString {
//Write a method that finds each occurrence of “abc_” in a String input 
//(where _ is a single character) and prints “bc_” for each such occurrence. 
//For example, findAbc(“abcdefabcghi”) should print:
//bcd,bcg
	public void findAbc(String s) {
		int dex = s.indexOf("abc",0);
		if(dex==-1||(dex+3)>=s.length()) {
			System.out.println("There is no requested String.");
		}
		else {
			do{
				if((dex+3)>=s.length()) {break;}
				System.out.println(s.substring(dex+1, dex+4));//substring [a,b[
				dex = s.indexOf("abc",dex+1);
			}
			while(dex!=-1);
		}
		System.out.println("------End 1---------");
	}
	
	public void findAbc1(String input) {
	    int index = input.indexOf("abc");
	    while (true) {
	        if (index == -1||(index+3) >= input.length()) {
	            break;
	        }
	        if((index+3)<input.length()) {
	        String found = input.substring(index+1, index+4);
	        System.out.println(found);
	        index = input.indexOf("abc", index+4);}
	    }
	    System.out.println("------End 2---------");
	}

	public static void main(String[] args) {
		findString fs = new findString();
		fs.findAbc("abcdefabcghi");
		fs.findAbc("abcd");
		fs.findAbc("abcdabc");
		fs.findAbc1("abcd");
		fs.findAbc1("abcdabc");
		System.out.println("abcdabc".length());
	}

}
