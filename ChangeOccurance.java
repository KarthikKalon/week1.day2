package assignmet.week1.day2;

public class ChangeOccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char arr[] = str.toCharArray();
		int Length = arr.length;
		for (int i = 0; i <Length; i++) {
			if (arr[i] == 'e')

				count = count + 1;

		}
		System.out.println( count);
	}
} 


