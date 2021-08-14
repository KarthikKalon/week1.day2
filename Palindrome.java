package assignmet.week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if (rev.equals(str)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
}
