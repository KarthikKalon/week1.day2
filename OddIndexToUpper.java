package assignmet.week1.day2;
  
public class OddIndexToUpper {
	public static void main(String[] args) {

		String word="changeme";
		char[] chr= word.toCharArray();
		for(int i=0;i<word.length();i++) {
			System.out.println(chr[i]);
			
		}
		for(int i=0;i<word.length();i++) {
			if(i%2 ==0) {
				System.out.println(Character.toUpperCase(chr[i]));
			}
			else {
				System.out.print(chr[i]);
			}
				
		}

	}

}
