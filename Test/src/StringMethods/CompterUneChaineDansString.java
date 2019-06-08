package StringMethods;

public class CompterUneChaineDansString {

	public static void main(String[] args) {
		String dna = "CTGCCTGCATGATCGTA";
		String target = "TG";
		int pos = dna.indexOf(target);
		int count = 0;
		while (pos >= 0) {
			  count = count + 1;
			  pos = dna.indexOf("TG",pos+target.length());
			}
		System.out.println(count);
	}
}
