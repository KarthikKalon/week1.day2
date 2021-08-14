package assignmet.week1.day2;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "stops";
		String str2 = "spots";
		if (str1.length() == str2.length()) {
			char[] chr1 = str1.toCharArray();
			char[] chr2 = str2.toCharArray();
			Arrays.sort(chr1);
			Arrays.sort(chr2);
			 for (int i = 0; i < str1.length(); i++) {
		            if (chr1[i] == chr2[i]) {
				System.out.println("strings are anagram");
		
			} else {
				System.out.println("strings are not anagram");
				
			}
		}
		
}

}
